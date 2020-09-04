package com.haein25.test.file.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.haein25.test.file.dto.FileDto;

public interface FileService {
	public void getList(HttpServletRequest request);
	public void saveFile(FileDto dto, ModelAndView mView, HttpServletRequest request);
	public void getFileData(int num, ModelAndView mView);
	public void deleteFile(int num, HttpServletRequest request);
}
