package com.example.selfintroapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.selfintroapp.domain.Appdata;
import com.example.selfintroapp.service.SelfintroAppService;

@Controller
@RequestMapping("/list")
public class SelfintroAppController {
	
	@Autowired
	SelfintroAppService service;
	
	
	@GetMapping
	public String list(Model model) {		
		
		List<Appdata> AppdataList =service.findAll();
//		AppdataList.add(new Appdata(1, 2019, 10, 32, "フリーランス", "動画編集", "運動不足だよ？"));
//		AppdataList.add(new Appdata(2, 2020, 3, 33, "倉庫作業員", "倉庫内のトート撒き", "歩き過ぎｗｗ"));
		model.addAttribute("AppdataList", AppdataList);		
		return "list";		
	}
	
//	this.id = id;
//	this.year = year;
//	this.month = month;
//	this.age = age;
//	this.profession = profession;
//	this.description = description;
//	this.remarks = remarks;
//}
	
	
	

}
