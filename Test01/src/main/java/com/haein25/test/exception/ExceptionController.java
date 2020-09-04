package com.haein25.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(NotDeleteException.class)
	public ModelAndView notDelete(NotDeleteException nde) {
		ModelAndView mView=new ModelAndView();
		mView.addObject("exception", nde);
		mView.setViewName("error/info");
		return mView;
	}
}