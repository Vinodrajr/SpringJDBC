package com.cl.spring_jdbc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cl.spring_jdbc.configuration.CarConfiguration;
import com.cl.spring_jdbc.dao.CarDao;

public class CarTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
		

		CarDao dao = context.getBean("carDao", CarDao.class);
		List<Map<String,Object>> cars=dao.getAllCar();
		for(Map<String,Object> car:cars) {
			System.out.println(car.get("cno"));
			System.out.println(car.get("name"));
			System.out.println(car.get("company"));
			System.out.println("======================");
		}

	}

}
