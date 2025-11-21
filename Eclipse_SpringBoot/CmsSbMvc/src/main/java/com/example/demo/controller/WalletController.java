package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Wallet;
import com.example.demo.service.WalletService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class WalletController {


	@Autowired
	private WalletService walletService;
	
	@GetMapping(value="/showCustomerWallet")
	public String showWallet(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int custId =(Integer)session.getAttribute("cid");
		List<Wallet> walletList = walletService.showWallet(custId);
		model.addAttribute("wallets", walletList);
		return "showCustomerWallet";
	}
}
