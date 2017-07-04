package com.github.wk09143787.srs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.wk09143787.srs.domain.Student;
import com.github.wk09143787.srs.mapper.StudentDao;
import com.github.wk09143787.srs.service.LoginService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student studentLogin(String ssn, String password) {
		Student stu=studentDao.selectBySsnAndPassword(ssn, password);
		return stu;
	}

}
