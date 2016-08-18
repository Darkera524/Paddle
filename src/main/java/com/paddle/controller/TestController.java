package com.paddle.controller;

import com.paddle.model.No;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paddle.inter.TestOperation;
import com.paddle.model.Test;
import com.paddle.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService testservice;
	
	
	@RequestMapping("/addtest")
	public String addtest(Model model){
		model.addAttribute("test", new Test());
		return "addtest";
	}
	
	@RequestMapping("/savetest")
	public String savetest(Test test,Model model){
		testservice.add(test);
		No no = new No();
		no.setNoid(1);
		String output = testservice.get(no);
		
		model.addAttribute("output", output);
		
		return "showtest";
	}

	@RequestMapping("/updatetest")
	public String updatetest(Model model){
		model.addAttribute("test", new Test());
		return "updatetest";
	}

	@RequestMapping("/updateexecutetest")
	public String updateexcutetest(Test test,Model model){
		testservice.update(test);
		No no = new No();
		no.setNoid(1);
		String output = testservice.get(no);

		model.addAttribute("output", output);

		return "showtest";
	}

	@RequestMapping("/deletetest")
	public String deletetest(Model model){
		model.addAttribute("test", new Test());
		return "deletetest";
	}

	@RequestMapping("/deleteexecutetest")
	public String deleteexcutetest(Test test,Model model){
		No no = new No();
		no.setNoid(test.getId());
		testservice.delete(no);

		String output = testservice.get(no);

		model.addAttribute("output", output);

		return "showtest";
	}
	
}
