package com.itedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@ResponseBody
	@RequestMapping("/username")
	public String getUser(){
		return "yantingji";
	}
}