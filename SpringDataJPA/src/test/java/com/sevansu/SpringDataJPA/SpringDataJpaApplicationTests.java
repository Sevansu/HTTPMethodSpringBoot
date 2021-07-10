package com.sevansu.SpringDataJPA;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sevansu.SpringDataJPA.entities.Student;
import com.sevansu.SpringDataJPA.repos.StudentRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	private StudentRepository rs;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("sevansug");
		student.setTestscore(100);
		rs.save(student);
		Student savedStudent = rs.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
