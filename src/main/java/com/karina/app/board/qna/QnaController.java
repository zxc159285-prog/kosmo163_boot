package com.karina.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.karina.app.page.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService; 
	
	@GetMapping("list")
	public void list(Pager pager,Model model) throws Exception {
		List<QnaDTO> ar =qnaService.list(pager);
		
		model.addAttribute("list", ar);	
	}
	@GetMapping("create")
	public void create()throws Exception{
		
	}
	@PostMapping("create")
	public String create(QnaDTO qnaDTO,@RequestParam("attach") MultipartFile[] attach)throws Exception{
		int result=qnaService.create(qnaDTO, attach);
		return "redirect:./list";
	}
	@GetMapping("detail")
	public void detail(QnaDTO qnaDTO,Model model) throws Exception {
		qnaDTO=qnaService.detail(qnaDTO);
		model.addAttribute("detail", qnaDTO);

		
	}
	@GetMapping("reply")
	public void replyCreate(QnaDTO qnaDTO,Model model)throws Exception{
		model.addAttribute("qnaDTO", qnaDTO);
		
	}
	@PostMapping("reply")
	public String replyCreate(QnaDTO qnaDTO)throws Exception{
		int result=qnaService.replyCreate(qnaDTO);
		return "redirect:./list";
		
	}

}
