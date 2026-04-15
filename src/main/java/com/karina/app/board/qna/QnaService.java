package com.karina.app.board.qna;

import java.io.File;
import java.time.chrono.IsoChronology;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.karina.app.page.Pager;



@Service
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Value("${app.upload.base}")
	private String filePath;
	@Value("${app.board.notice}")
	private String notice;
	
	public List<QnaDTO> list(Pager pager) throws Exception{
		pager.makePageNumber(qnaMapper.getCount(pager));
		pager.makerRowNumber();
		return qnaMapper.list(pager);
	}
	public int create(QnaDTO qnaDTO,MultipartFile[]attach) throws Exception{
		int result=qnaMapper.create(qnaDTO);
		
		String filePath=this.filePath+this.notice;
		
		if(attach==null) {
			return result;
		}
		for(MultipartFile m:attach) {
			
			if(m.isEmpty()) {
				continue;
			}
		//파일이름 중복안되게 만들기	
		String fileName=UUID.randomUUID().toString();	
		fileName=fileName+"_"+m.getOriginalFilename();
		
		//저장
		File file=new File(filePath);
		
		if(!file.exists()) {
			file.mkdir();
		}
		
		file=new File(file, fileName);
		m.transferTo(file);
		
		QnaFileDTO qnaFileDTO=new QnaFileDTO();
		qnaFileDTO.setNoticeNo(qnaDTO.getNoticeNo());
		qnaFileDTO.setFileName(fileName);
		qnaFileDTO.setOriName(m.getOriginalFilename());
		result=qnaMapper.createFile(qnaFileDTO);
		}
		return result;
	}
	
	public QnaDTO detail(QnaDTO qnaDTO)throws Exception{
		 return qnaMapper.detail(qnaDTO);
		
		 
	}
	public int replyCreate(QnaDTO qnaDTO) throws Exception{
		QnaDTO parent = qnaMapper.detail(qnaDTO);
		//답글의 ref
		qnaDTO.setRef(parent.getRef());
		//답글의 step
		qnaDTO.setStep(parent.getStep()+1);
		//답글의 depth
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result = qnaMapper.replyUpdate(parent);
		
		result =qnaMapper.create(qnaDTO);
		
		return result;

	}
}
