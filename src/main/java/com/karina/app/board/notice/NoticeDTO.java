package com.karina.app.board.notice;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class NoticeDTO {

		private Long noticeNo;
		private String title;
		private String contents;
		private String writer;
		private LocalDateTime createdate;
		private Long hit;
}
