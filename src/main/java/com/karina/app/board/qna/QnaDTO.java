package com.karina.app.board.qna;

import com.karina.app.board.BoardDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO {

	private Long ref;
	private Long step;
	private Long dex;
}
