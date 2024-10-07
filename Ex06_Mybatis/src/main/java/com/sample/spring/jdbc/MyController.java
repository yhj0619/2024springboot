package com.sample.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	private IMyUserDao dao;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "jdbc Test";
	}
	
	@RequestMapping("/user")
	public String userListpage(Model model) {
		model.addAttribute("users", dao.list());
		return "userlist";
	}
}
