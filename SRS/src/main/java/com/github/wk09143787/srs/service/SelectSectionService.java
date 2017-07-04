package com.github.wk09143787.srs.service;

import java.util.ArrayList;

import com.github.wk09143787.srs.domain.Student;

public interface SelectSectionService {

	String selectSection(String ssn, int sectionNo);

	ArrayList<Student> queryEnrolledStudents(String sectionNo);

}
