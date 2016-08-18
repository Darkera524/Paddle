package com.paddle.inter;

import java.util.List;

import com.paddle.model.No;
import com.paddle.model.Test;

public interface TestOperation {
	
	public List<Test> selectTest(No no);
	public void addTest(Test test);
	public void updateTest(Test test);
	public void deleteTest(No no);
	
}
