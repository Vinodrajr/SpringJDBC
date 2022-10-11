package com.cl.spring_jdbc.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.cl.spring_jdbc.dto.Car;
import com.cl.spring_jdbc.util.CarMapper;


@Repository
public class CarDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CarMapper carMapper;

	public void saveCar(Car car) {

		String sql = "insert into car values(?,?,?)";
		Object agr[] = { car.getCno(), car.getName(), car.getCompany() };
		jdbcTemplate.update(sql, agr);
		System.out.println("Inserted");

	}

	public Car getCar(int id) {
		String sql = "select * from car where cno=?";
		Object agr[] = { id };
		return jdbcTemplate.queryForObject(sql, agr,carMapper);
	}

	public List<Map<String, Object>> getAllCar() {
		String sql = "select * from car ";
		return jdbcTemplate.queryForList(sql);

	}

	
}
