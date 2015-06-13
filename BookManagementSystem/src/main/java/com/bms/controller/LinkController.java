package com.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return new ModelAndView("bmsHome");
	}

	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return new ModelAndView("bmsHome");
	}

}
