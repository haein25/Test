package com.haein25.test.cafe.service;

import javax.servlet.http.HttpServletRequest;

import com.haein25.test.cafe.dto.CafeDto;

public interface CafeService {
	public void getList(HttpServletRequest request);
	public void getDetail(HttpServletRequest request);
	public void saveContent(CafeDto dto);
	public void updateContent(CafeDto dto);
}
