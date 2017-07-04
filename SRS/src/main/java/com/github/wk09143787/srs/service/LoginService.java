package com.github.wk09143787.srs.service;

import com.github.wk09143787.srs.domain.Student;

public interface LoginService {
	/**
	 * 学生登陆
	 * @param ssn
	 * @param password
	 * @return
	 */
	Student studentLogin(String ssn, String password);
}
