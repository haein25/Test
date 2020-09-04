package com.haein25.test.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.haein25.test.users.dto.UsersDto;

public interface UsersService {
	public Map<String, Object> isExistId(String inputId);
	public void addUser(UsersDto dto);
	public void loginProcess(UsersDto dto, ModelAndView mView, HttpSession session);
	public void getInfo(HttpSession session, ModelAndView mView);
}
