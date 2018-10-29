package com.stackroute.fullstackassignment.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class FriendsList {

    @GraphId
    private long id;
    @NotNull

    String userName;
    int age;
    String address;
    @Relationship(type="friendOf", direction= Relationship.INCOMING)
    private List<FriendSince> friendsince;

    public FriendsList() {
    }

    public FriendsList(@NotNull String userName, int age, String address) {
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<FriendSince> getFriendsince() {
        return friendsince;
    }

    public void setFriendsince(List<FriendSince> friendsince) {
        this.friendsince = friendsince;
    }

    public void addFriend(FriendSince friendsince) {

        if (this.friendsince == null) {
            this.friendsince = new ArrayList<>();

        }
        this.friendsince.add(friendsince);
    }
}
