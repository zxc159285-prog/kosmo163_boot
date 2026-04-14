package com.karina.app.board.notice;

import com.karina.app.files.FileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NoticeFileDTO extends FileDTO {
	private Long noticeNo;

}
