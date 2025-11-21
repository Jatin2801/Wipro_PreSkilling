package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Orders;
import com.example.demo.model.Wallet;
import com.example.demo.service.OrderService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class OrdersController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value="/showCustomerOrders")
	public String showWallet(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int custId =(Integer)session.getAttribute("cid");
		List<Orders> orders = orderService.searchByCustomerId(custId);
		model.addAttribute("orders", orders);
		return "showCustomerOrders";
	}
}
