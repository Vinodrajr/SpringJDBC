package com.cl.spring_jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cl.spring_jdbc.dto.Car;

@Component
public class CarMapper implements RowMapper<Car> {
	@Autowired
	private Car car;

	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		car.setCno(rs.getInt("cno"));
		car.setName(rs.getString("name"));
		car.setCompany(rs.getString("company"));
		return car;
	}

}
