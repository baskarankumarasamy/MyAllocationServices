package com.allocations.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatasourceConfiguration {

	@Autowired
	private Environment env;
	
	@Bean(name = "mysqlDataSource", destroyMethod = "close")
	public DataSource mysqlDataSource() throws SQLException
	{
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(this.env.getProperty("spring.datasource.mysql.driver-class-name"));
		ds.setJdbcUrl(this.env.getProperty("spring.datasource.mysql.url"));
		ds.setUsername(this.env.getProperty("spring.datasource.mysql.username"));
		ds.setPassword(this.env.getProperty("spring.datasource.mysql.password"));
		ds.setConnectionTestQuery("SELECT 1");
		return ds;
	}
}
