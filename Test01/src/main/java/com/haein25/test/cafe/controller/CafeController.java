package com.haein25.test.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.haein25.test.cafe.service.CafeService;

@Controller
public class CafeController {
	@Autowired
	private CafeService cafeService;

}