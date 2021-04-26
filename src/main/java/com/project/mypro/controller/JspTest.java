package com.project.mypro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.mypro.model.Board;
import com.project.mypro.repository.BoardRepository;

//@RequestMapping("/board")
@Controller
public class JspTest {

    @Autowired
    private BoardRepository boardRepository;
    
	@RequestMapping("/welcome-jsp.do")

	public String welcome() {

	    return "welcome";

	}

	@RequestMapping("/welcome-board.do")

	public String welcome(Model model) throws Exception {

	    model.addAttribute("greeting", "Hello Thymeleaf!");

	    return "board/welcome";

	}
	
//	@RequestMapping(value="/ajax", method= {RequestMethod.POST, RequestMethod.GET})
//    public String form(Model model, String title, String content) {
//		
//		List<Board> list = new ArrayList<>();
//	      list = boardrepository.findByTitleOrContent(title, content);
//	      model.addAttribute("list", list);
//        return "ajax";
//    }
	
	@RequestMapping("/ajax")

	public String test1() {

	    return "ajax";

	}
}
