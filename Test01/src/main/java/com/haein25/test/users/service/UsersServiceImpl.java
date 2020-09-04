package com.haein25.test.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haein25.test.users.dao.UsersDao;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao dao;

}