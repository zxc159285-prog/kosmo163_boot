package com.karina.app.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.karina.app.page.Pager;

@Mapper
public interface QnaMapper {
	
	public Long getCount(Pager pager) throws Exception;
	public abstract List<QnaDTO> list(Pager pager) throws Exception;
	
}
