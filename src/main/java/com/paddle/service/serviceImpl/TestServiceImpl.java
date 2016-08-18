package com.paddle.service.serviceImpl;

import java.util.List;

import com.paddle.model.No;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paddle.inter.TestOperation;
import com.paddle.model.Test;
import com.paddle.service.*;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestOperation testOperation;
	

	public void add(Test test) {
		testOperation.addTest(test);
		
	}


	public String get(No no) {
		List<Test> list = testOperation.selectTest(no);
		String output = "";
		for(int i=0;i<list.size();i++){
			output = output+list.get(i).getId()+list.get(i).getText()+" ";
		}
		/*Test test = testOperation.selectTest(no);
		String output = "";

		output = test.getId()+test.getText();*/

		return output;
	}

	public void update(Test test){
		testOperation.updateTest(test);
	}

	public void delete(No no){
		testOperation.deleteTest(no);
	}
	
}
