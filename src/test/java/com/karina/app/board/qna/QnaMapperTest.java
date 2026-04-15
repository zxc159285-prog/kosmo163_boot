package com.karina.app.board.qna;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QnaMapperTest {

	@Autowired
	private QnaMapper qnaMapper;
	@Test
	void testCreate()throws Exception {
		QnaDTO qnaDTO=new QnaDTO();
		qnaDTO.setTitle("답글2");
		qnaDTO.setContents("답글내용2");
		qnaDTO.setWriter("user");
		qnaDTO.setRef(43L);
		qnaDTO.setStep(1L);
		qnaDTO.setDepth(1L);
		
		int result = qnaMapper.create(qnaDTO);
		assertEquals(1,result);
	}

}
