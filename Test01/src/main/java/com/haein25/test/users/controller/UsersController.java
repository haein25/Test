package com.haein25.test.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.haein25.test.users.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	private UsersService service;

}