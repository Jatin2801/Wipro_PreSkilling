package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mvc.config.MvcConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/calcresult")
	public ModelAndView calculation(HttpServletRequest req) {
		int firstNo, secondNo, result;
		firstNo = Integer.parseInt(req.getParameter("firstNo"));
		secondNo = Integer.parseInt(req.getParameter("secondNo"));
		result = firstNo + secondNo;
		return new ModelAndView("calcresult","result",result);
	}
	
	@RequestMapping(value="/nameresult")
	public ModelAndView nameResult(HttpServletRequest req) {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String fullName = firstName +" " +lastName;
		return new ModelAndView("result","fullName",fullName);
	}
	
	@RequestMapping(value="/testaction")
	public ModelAndView testAction(HttpServletRequest req) {
		String sname= req.getParameter("sname");
		return new ModelAndView("show","sname",sname);
	}
	
	@RequestMapping(value="/loginresult")
	public ModelAndView loginAction(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Wipro") && pwd.equals("Wipro")) {
			return new ModelAndView("menu");
		} else {
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping(value="/calc")
	public ModelAndView calc() {
		return new ModelAndView("calc");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/bhavana")
	public ModelAndView bhavana() {
		return new ModelAndView("bhavana");
	}
	
	@RequestMapping(value="/name")
	public ModelAndView namepage() {
		return new ModelAndView("Name");
	}
	

	@RequestMapping(value="/test")
	public ModelAndView test() {
		return new ModelAndView("test");
	}
	@RequestMapping(value="/vatsal")
	public ModelAndView vatsal() {
		return new ModelAndView("vatsal");
	}
	
	@RequestMapping(value="/amrit")
	public ModelAndView amrit() {
		return new ModelAndView("amrit");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
