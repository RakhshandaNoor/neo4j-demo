package com.stackroute.fullstackassignment.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class Users {
    @GraphId
    private long id;
    @NotNull

    String userName;
    int age;
    String address;
    @Relationship(type="friendOf")
    private List<FriendsList> friendsList= new ArrayList<>();



    public Users() {
    }

    public Users( @NotNull String userName, int age, String address) {

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

    public List<FriendsList> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<FriendsList> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}
