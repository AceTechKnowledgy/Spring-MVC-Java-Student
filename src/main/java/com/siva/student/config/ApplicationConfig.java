package com.siva.student.config;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//This class will act as Bootstrap for Spring framework for configuration
@Configuration
@ComponentScan(basePackages= {"com.siva.student.dao","com.siva.student.service"})
@PropertySource(value={"classpath:application.properties"})
public class ApplicationConfig {
	
	//To get the environment variables
	@Autowired
	private Environment environment;
	
	//To get the DataSource Object
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("dburl"));
		dataSource.setUsername(environment.getProperty("dbuser"));
		dataSource.setPassword(environment.getProperty("dbpassword"));
		dataSource.setDriverClassName(environment.getProperty("dbdriver"));
		return dataSource;
	}
	
	//To get the JDBCTemplate instance
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
