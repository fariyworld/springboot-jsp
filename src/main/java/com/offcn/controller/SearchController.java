package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SearchController {

	@RequestMapping("/")
	public ModelAndView home(){
		
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
}
