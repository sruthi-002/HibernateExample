package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.hibernateService;
import com.example.demo.model.hibernate;


@RestController
public class hibernateController {
	@Autowired
	hibernateService service;
	@GetMapping("/")
	public String listAll(Model model)
	{
		List<hibernate> listdesign = service.listAll();
        model.addAttribute("listdesign", listdesign);	
        return"index";
	}
}
