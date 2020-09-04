package com.haein25.test.users.service;

import java.util.Map;

import com.haein25.test.users.dto.UsersDto;

public interface UsersService {
	public Map<String, Object> isExistId(String inputId);
	public void addUser(UsersDto dto);
}
