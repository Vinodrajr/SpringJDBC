package com.cl.spring_jdbc.dto;

import org.springframework.stereotype.Component;

@Component(value ="cars")
public class Car {

	private int cno;
	private String name;
	private String company;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [cno=" + cno + ", name=" + name + ", company=" + company + "]";
	}

}
