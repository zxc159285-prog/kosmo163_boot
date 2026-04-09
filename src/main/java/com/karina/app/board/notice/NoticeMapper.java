package com.karina.app.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	//list
	public abstract List<NoticeDTO> list() throws Exception;
	//detail
	public abstract NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;
	//create
	public abstract int create(NoticeDTO noticeDTO) throws Exception;
	//update
	public abstract int update(NoticeDTO noticeDTO) throws Exception;
	//delete
	public abstract int delete(NoticeDTO noticeDTO) throws Exception;
}	
