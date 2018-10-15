package com.demo.spring;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@PropertySource(value="application.properties")
public class MyDaoConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix="app.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
