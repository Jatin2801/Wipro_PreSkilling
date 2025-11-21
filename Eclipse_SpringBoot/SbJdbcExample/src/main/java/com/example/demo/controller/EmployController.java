package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.EmployDao;
import com.example.demo.model.Employ;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployController {

	@Autowired
	private EmployDao employDao;
	
	 @PostMapping(value = "/saveemploy")
	 public String saveEmploy(@ModelAttribute Employ employ) {
	     employDao.addEmployDao(employ);
	     return "redirect:/";   // ⬅ redirect to default mapping
	 }

	
	@GetMapping(value="/newemploy")
	public String newEmploy(@ModelAttribute Employ employ) {
		return "addemploy";
	}
	
	@GetMapping(value="/deleteemploy")
	public String deleteEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		employDao.deleteEmployDao(empno);
		  return "redirect:/";   // ⬅ redirect to default mapping
	}
	
	@GetMapping(value="/updatefinal")
	 public String updateEmploy(@ModelAttribute Employ employ) {
		employDao.updateEmployDao(employ);
		  return "redirect:/";   // ⬅ redirect to default mapping
	 }

	
	@GetMapping(value="/updateemploy")
	public String updateEmploy(HttpServletRequest request, Model model) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employ = employDao.searchEmployDao(empno);
		model.addAttribute("employ",employ);
		return "updateemploy";
	}
	
	@GetMapping(value="/")
	public String show(Model model) {
		List<Employ> employList = employDao.showEmployDao();
		model.addAttribute("employList",employList);
		return "employshow";
	}
}
