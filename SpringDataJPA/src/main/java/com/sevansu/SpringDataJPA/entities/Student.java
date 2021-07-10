package com.sevansu.SpringDataJPA.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private long id;
	private String name;
	private int testscore;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestscore() {
		return testscore;
	}

	public void setTestscore(int testscore) {
		this.testscore = testscore;
	}

}
