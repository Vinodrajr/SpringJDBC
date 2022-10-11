package com.cl.spring_jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.cl.spring_jdbc"})
public class CarConfiguration {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/jdbcforonline";
		String username = "root";
		String password = "root";
		return new DriverManagerDataSource(url, username, password);

	}
}
