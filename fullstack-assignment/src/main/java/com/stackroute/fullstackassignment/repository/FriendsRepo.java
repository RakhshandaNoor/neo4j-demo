package com.stackroute.fullstackassignment.repository;

import com.stackroute.fullstackassignment.domain.FriendsList;
import com.stackroute.fullstackassignment.domain.Users;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;


public interface FriendsRepo extends Neo4jRepository<FriendsList,Long> {


    @Query("MATCH (m:Users)-[r:friendOf]->(a:FriendsList) RETURN m,r,a LIMIT {limit}")
    Collection<FriendsList> graph(@Param("limit") int limit);
}
