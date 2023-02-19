package com.lakhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.lakhan.Repo")
@ComponentScan(basePackages = {"com.lakhan"})
public class StudentReportingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentReportingSystemApplication.class, args);
	}

}
