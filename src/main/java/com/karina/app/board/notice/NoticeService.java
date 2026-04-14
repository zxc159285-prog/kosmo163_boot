package com.karina.app.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.karina.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	@Value("${app.upload.base}")
	private String filePath;
	@Value("${app.board.notice}")
	private String notice;
	public List<NoticeDTO> list(Pager pager) throws Exception{
		
		pager.makePageNumber(noticeMapper.getCount(pager));
		pager.makerRowNumber();
		return noticeMapper.list(pager);
		
		
	}
	
	
	
	public int create(NoticeDTO noticeDTO,MultipartFile [] attach) throws Exception{
		
		int result = noticeMapper.create(noticeDTO);
		//1. 어디에 저장할것인가
		log.info(filePath);
		String filePath=this.filePath+this.notice;
		
		//attach 자체가 null인 경우
		if(attach==null) {
			return result;
		}
		
		for(MultipartFile m:attach) {
			
			
			//파일이 없는경우
			if(m.isEmpty()) {
			continue;
			}
			
			
		//2. 어떤 이름으로 저장할것인가
		String fileName=UUID.randomUUID().toString();
//		log.warn(fileName);
//		
		//3. 확장자는 어떻게할것인가
//		log.error(attach.getOriginalFilename());
//		String f= attach.getOriginalFilename();
//		f=f.substring(f.lastIndexOf("."));
//		log.info(f);
		
		fileName=fileName+"_"+m.getOriginalFilename();
		
		//4. 저장
		File file = new File(filePath);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		file=new File(file,fileName);
		
		//파일저장 2가지방법. 멀티파트 메서드
		m.transferTo(file);
		//또는 스프링에서제공하는것
		//FileCopyUtils.copy(attach.getBytes(),file);
		
		//5. db에 저장하기
		NoticeFileDTO noticeFileDTO=new NoticeFileDTO();
		noticeFileDTO.setFileName(fileName);
		noticeFileDTO.setOriName(m.getOriginalFilename());
		noticeFileDTO.setNoticeNo(noticeDTO.getNoticeNo());
		result=noticeMapper.createFile(noticeFileDTO);
		}
		return result;//noticeMapper.create(noticeDTO);
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception{
		return noticeMapper.detail(noticeDTO);
	}
}
