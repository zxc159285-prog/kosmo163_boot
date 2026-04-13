package com.karina.app.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.karina.app.page.Pager;

@Mapper
public interface NoticeMapper {
	
	
	public Long getCount(Pager pager)throws Exception;
	//list
	public abstract List<NoticeDTO> list(Pager pager) throws Exception;
	//detail
	public abstract NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;
	//create
	public abstract int create(NoticeDTO noticeDTO) throws Exception;
	//update
	public abstract int update(NoticeDTO noticeDTO) throws Exception;
	//delete
	public abstract int delete(NoticeDTO noticeDTO) throws Exception;
}	
