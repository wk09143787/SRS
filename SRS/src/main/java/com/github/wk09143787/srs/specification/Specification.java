package com.github.wk09143787.srs.specification;

import com.github.wk09143787.srs.domain.Section;
import com.github.wk09143787.srs.domain.Student;

public interface Specification<T> {
	String validate(Student student, Section section);
}
