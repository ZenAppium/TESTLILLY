package com.eval.coronakit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eval.coronakit.dao.RolesRepository;
import com.eval.coronakit.dao.UserRepository;

@Controller
public class LoginController {
	@Autowired
	UserRepository userRepo;
	@Autowired
	RolesRepository rolesRepo;

	@RequestMapping("/custom-login")
	public String login() {
		String view = "login-form";
		return view;
	}

	@RequestMapping("/custom-error")
	public String error() {
		return "error-page";
	}
}
