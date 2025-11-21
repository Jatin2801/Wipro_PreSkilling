package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/")
	public String customerLogin() {
		return "customerlogin";
	}
	
	@GetMapping(value="/customerInfo")
	public String customerInfo(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int custId =(Integer)session.getAttribute("cid");
		Customer customer = customerService.searchByCustomerId(custId);
		model.addAttribute("customer",customer);
		return "customerInfo";
	}
	
	@GetMapping(value="/loginValidate")
	public String login(HttpServletRequest request, Model model) {
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		Customer customer = customerService.login(user, pwd);
		if (customer != null) {
//			model.addAttribute("cid",customer.getCusId());
			 HttpSession session = request.getSession();
		        session.setAttribute("customer", customer);   // store entire customer object
		        session.setAttribute("cid", customer.getCusId()); // store id also
			return "customermenu";
		}
		model.addAttribute("error","Invalid Credentials...");
		return "customerlogin";
	}
}
