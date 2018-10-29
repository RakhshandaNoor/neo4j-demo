package com.stackroute.fullstackassignment.repository;

import com.stackroute.fullstackassignment.domain.Users;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsersRepo extends Neo4jRepository<Users, Long> {
}
