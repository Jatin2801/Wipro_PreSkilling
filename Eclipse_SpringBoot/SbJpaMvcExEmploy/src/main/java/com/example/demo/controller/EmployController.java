package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;
import com.example.demo.service.EmployService;

@Controller
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@GetMapping(value="/")
	public String show(Model model) {
		List<Employ> employList = employService.showEmploy();
		model.addAttribute("employList",employList);
		return "employshow";
	}
}
