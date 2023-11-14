package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {


	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String viewPage() {

		return "gititemedit";
	}
	@RequestMapping(path = "/gititemedit2", method = RequestMethod.POST)
	public String viewPage2(Model model,String par,String par2) {
		model.addAttribute("name",par);
		model.addAttribute("kane",par2);
		return "gititemedit2";
	}
	

	
}