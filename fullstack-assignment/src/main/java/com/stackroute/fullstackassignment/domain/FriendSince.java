package com.stackroute.fullstackassignment.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RelationshipEntity(type="friendOf")
public class FriendSince {

    @GraphId
    private long id;
    Date since;
    private List<String> friendsince = new ArrayList<>();

    @StartNode

    private Users users;

    @EndNode
    private FriendsList friendsList;

    public FriendSince() {
    }

    public FriendSince(Date since, Users users, FriendsList friendsList) {
        this.since = since;
        this.users = users;
        this.friendsList = friendsList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public FriendsList getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(FriendsList friendsList) {
        this.friendsList = friendsList;
    }

    public List<String> getFriendsince() {
        return friendsince;
    }

    public void setFriendsince(List<String> friendsince) {
        this.friendsince = friendsince;
    }

    public void addFriendName(String name){

        if(this.friendsince==null){
            this.friendsince= new ArrayList<>();
        }
        this.friendsince.add(name);
    }
}
