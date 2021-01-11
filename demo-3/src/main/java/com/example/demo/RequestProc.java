package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestProc {

	@RequestMapping(value="/callResponse")
	public  ModelAndView response(@RequestParam("name")  String name,
								@RequestParam("tweet") String tweet) {
		ModelAndView mav =new  ModelAndView();
		mav.setViewName("NewFile");
		mav.addObject("response", "こんにちは" + name + "さん" +tweet);

		return mav;

	}
	@RequestMapping(value="/")
	public String NewFile() {

		return "NewFile";

	}
}