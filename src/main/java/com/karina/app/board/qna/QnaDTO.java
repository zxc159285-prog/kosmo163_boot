package com.karina.app.board.qna;

import java.util.List;

import com.karina.app.board.BoardDTO;
import com.karina.app.board.notice.NoticeFileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO {
	private List<QnaFileDTO> list ;
	private Long ref;
	private Long step;
	private Long depth;
}
