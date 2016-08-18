package com.paddle.service;

import com.paddle.model.No;
import com.paddle.model.Test;

public interface TestService {
	void add(Test test);
	String get(No no);
	void update(Test test);
	void delete(No no);
}
