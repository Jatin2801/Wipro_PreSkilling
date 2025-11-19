package com.java.spr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.dao.EmployDao;
import com.java.spr.model.Employ;
import com.java.spr.model.Gender;

@Controller
public class HomeController {

	@Autowired
	private EmployDao employDao;
	
	@RequestMapping(value="/addEmploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addEmploy");
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView deleteEmploy(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		employDao.deleteEmployDao(empno);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/insertFinal")
	public ModelAndView insertFinal(HttpServletRequest request) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(Gender.valueOf(request.getParameter("gender")));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
//		System.out.println(employ);
		employDao.addEmployDao(employ);
		return new ModelAndView("redirect:/");

	}
	
	@RequestMapping(value="/updatefinal")
	public ModelAndView updateConfirm(HttpServletRequest request) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(Gender.valueOf(request.getParameter("gender")));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
//		System.out.println(employ);
		employDao.updateEmployDao(employ);
		return new ModelAndView("redirect:/");

	}
	@RequestMapping(value="/update")
	public ModelAndView update(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employ = employDao.searchEmployDao(empno);
		return new ModelAndView("update","employ",employ);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = employDao.showEmployDao();
		return new ModelAndView("home","employList",employList);
	}
}
