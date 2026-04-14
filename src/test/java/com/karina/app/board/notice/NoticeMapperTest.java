package com.karina.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
class NoticeMapperTest {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Test
	void detailTest()throws Exception{
		NoticeDTO noticeDTO=new NoticeDTO();
		noticeDTO.setNoticeNo(354L);
		
		noticeDTO= noticeMapper.detail(noticeDTO);
		
		
		log.info("Map : {}",noticeDTO);
		assertNotNull(noticeDTO);
	}

//	@Test
//	void testList() throws Exception {
//		List<NoticeDTO> ar = noticeMapper.list();
//
//		assertNotEquals(0, ar.size());
//
//	}

	//@Test
	void testCreate() throws Exception {
		int idx=1;
		for(int i=0;i<110;i++) {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("보지마"+i);
		noticeDTO.setContents("바보"+i);
		noticeDTO.setWriter("P00"+idx);

		int result = noticeMapper.create(noticeDTO);
		idx++;
		
		if(idx>9) {
			idx=1;
		}
		if(i%10==0) {
		
			Thread.sleep(1000);
		}
		}
		System.out.println("fnish");
	}

	//@Test
	void testDetail() {
		fail("Not yet implemented");
	}

	//@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	//@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
