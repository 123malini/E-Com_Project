package com.niit.ShopWatch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	@RequestMapping("/")
public ModelAndView user(){
	ModelAndView mv= new ModelAndView("homepage");
	 mv.addObject("msg","hello");
	 return mv;
	}
	
}
