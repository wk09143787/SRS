package com.github.wk09143787.srs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.wk09143787.srs.domain.Course;
import com.github.wk09143787.srs.mapper.PlanOfStudyDao;
import com.github.wk09143787.srs.service.PlanOfStudyService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("planOfStudyService")
public class PlanOfStudyServiceImpl implements PlanOfStudyService {

	@Autowired
	private PlanOfStudyDao planOfStudyDao;
	
	@Override
	public List<Course> queryPlanOfStudy(String ssn) {
		return planOfStudyDao.queryPlanOfStudy(ssn);
	}

}
