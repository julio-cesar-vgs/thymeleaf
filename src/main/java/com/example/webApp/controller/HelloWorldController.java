package com.example.webApp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping
	public ModelAndView index(Model model) {
		ModelAndView mv = new ModelAndView("/hello");

		mv.addObject("name", "leonam");
		return mv;

	}

	@GetMapping("/new")
	public String newPath(Model model) {
		
		List<String> lista = Arrays.asList("Julio","Batista","Rodolfo");
		
		model.addAttribute("name","Leonam");
		model.addAttribute("list",lista);
		return "new";
	}
}
