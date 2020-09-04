package com.haein25.test.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haein25.test.cafe.dao.CafeDao;

@Service
public class CafeServiceImpl implements CafeService{
	@Autowired
	private CafeDao cafeDao;

	@Override
	public void getList(HttpServletRequest request) {
		
	}

}