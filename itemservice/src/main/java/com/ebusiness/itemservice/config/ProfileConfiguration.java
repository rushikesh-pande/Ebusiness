package com.ebusiness.itemservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Profile("development")
@Configuration

public class ProfileConfiguration {

	private final static Logger LOGGER = LoggerFactory.getLogger(ProfileConfiguration.class);
	
	/*
	 * @Value("${db.name}") private String databaseName;
	 * 
	 * @Value("${ddl.filename}") private String ddlFileName;
	 * 
	 * @Bean public DataSource dataSource() throws SQLException {
	 * System.out.println("******** db name ********"+ databaseName); DataSource
	 * dataSource = new
	 * EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).setName(
	 * databaseName) .addScript(ddlFileName).build();
	 * LOGGER.info("H2 database is running with metadata: {}",
	 * dataSource.getConnection().getMetaData().toString()); return dataSource; }
	 */
}
