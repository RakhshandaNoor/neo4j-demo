package com.stackroute.fullstackassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.annotation.EnableNeo4jAuditing;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
//@EnableNeo4jRepositories("com.stackroute.fullstackassignment.repository")
public class FullstackAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackAssignmentApplication.class, args);
	}
}
