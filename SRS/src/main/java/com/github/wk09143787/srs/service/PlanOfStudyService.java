package com.github.wk09143787.srs.service;

import java.util.List;

import com.github.wk09143787.srs.domain.Course;

public interface PlanOfStudyService {

	List<Course> queryPlanOfStudy( String ssn );
	
}
