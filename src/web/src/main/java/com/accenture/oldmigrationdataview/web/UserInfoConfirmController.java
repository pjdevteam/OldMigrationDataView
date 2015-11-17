package com.accenture.oldmigrationdataview.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.oldmigrationdataview.domain.User;
import com.accenture.oldmigrationdataview.service.UserService;

@Controller
public class UserInfoConfirmController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/UserInfoConfirm", method=RequestMethod.POST)
	String form(
		@RequestParam("userName") String userName,
		@RequestParam("password") String password) {
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setCreatedAt(new Date());
		service.save(user);
		
		return "redirect:/";
	}
}
