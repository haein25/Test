package com.haein25.test.file.dao;

import java.util.List;

import com.haein25.test.file.dto.FileDto;

public interface FileDao {
	public List<FileDto> getList(FileDto dto);
	public int getCount(FileDto dto);
	public void insert(FileDto dto);
	public FileDto getData(int num);
}
