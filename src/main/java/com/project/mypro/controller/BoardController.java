package com.project.mypro.controller;

import javax.validation.Valid;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.mypro.model.Board;
import com.project.mypro.repository.BoardRepository;
import com.project.mypro.repository.BoardRepository2;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardRepository2 boardRepository2;
    

    
//    @Autowired
//    private BoardValidator boardValidator;

    @GetMapping("/list")
    public String list(Model model, @PageableDefault(size = 2) Pageable pageable,
    				   @RequestParam(required = false, defaultValue = "") String msg,
                       @RequestParam(required = false, defaultValue = "") String searchText) {
        Page<Board> boards = boardRepository.findByTitleContainingOrContentContaining(searchText, searchText, pageable);
        int startPage = Math.max(1, boards.getPageable().getPageNumber() - 4);
        int endPage = Math.min(boards.getTotalPages(), boards.getPageable().getPageNumber() + 4);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("boards", boards);
        model.addAttribute("msg",msg);


        return "board/list";
    }
    
    @GetMapping("/form")
    public String form(Model model, @RequestParam(required = false) Long id) {
        if(id == null) {
        	model.addAttribute("board", new Board());
        } else {
            Board board = boardRepository.findById(id).orElse(null);
            model.addAttribute("board", board);
        }
        return "board/form";
    }

    
// 두개
    @Transactional(rollbackFor=Exception.class)
    @RequestMapping(value="/form", method=RequestMethod.POST)
    public String greetingSubmit(@Valid Board board, RedirectAttributes redirectAttributes) throws Exception{
    	try{
//        boardRepository2.save(board2);
        boardRepository.save(board);
//        SecurityContextHolder.clearContext();
    	}
    	catch(Exception e){
    		
    		return "redirect:/board/list";
    	}
    	redirectAttributes.addAttribute("msg","ok");
    	return "redirect:/board/list";
    }
    
//    @PostMapping("/form")
//    public String delete(Model model, @RequestParam(required = false) Long id) {
//    		if(id==null) {
//    			return "redirect:/board/list";
//    		}
//    		try {
//    			boolean 
//    		}
//    	return"";
//    }
    
      
}

