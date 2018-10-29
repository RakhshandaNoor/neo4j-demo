package com.stackroute.fullstackassignment.services;

import com.stackroute.fullstackassignment.domain.FriendsList;

import java.util.List;

public interface FriendService {

    public FriendsList addFriend(FriendsList friendsList);
    public boolean deleteFriend(FriendsList friendsList);
    public FriendsList searchFriendById(Long id);
    public List<FriendsList> getAllFriendsList();
}
