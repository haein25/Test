package com.haein25.test.file.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haein25.test.file.service.FileService;

@Controller
public class FileController {
	@Autowired
	private FileService fileService;

	//파일 목록 보기 요청 처리 
	@RequestMapping("/file/list")
	public ModelAndView list(HttpServletRequest request,
			ModelAndView mView) {

		mView.setViewName("file/list");
		return mView;
	}

}