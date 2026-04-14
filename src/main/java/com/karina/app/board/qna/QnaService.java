package com.karina.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karina.app.page.Pager;

@Service
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	public List<QnaDTO> list(Pager pager) throws Exception{
		pager.makePageNumber(qnaMapper.getCount(pager));
		pager.makerRowNumber();
		return qnaMapper.list(pager);
	}
}
