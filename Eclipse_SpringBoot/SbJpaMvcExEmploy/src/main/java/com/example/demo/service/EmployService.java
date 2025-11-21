package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.repo.EmployRepository;

@Service
public class EmployService  {

	@Autowired
	private EmployRepository employRepository;
	
	public List<Employ> showEmploy() {
		return employRepository.findAll();
	}
}
