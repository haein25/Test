package com.haein25.test.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haein25.test.file.dao.FileDao;

@Service
public class FileServiceImpl implements FileService{
	@Autowired
	private FileDao fileDao;

}
