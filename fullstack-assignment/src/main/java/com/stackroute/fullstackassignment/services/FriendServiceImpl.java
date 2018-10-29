package com.stackroute.fullstackassignment.services;

import com.stackroute.fullstackassignment.domain.FriendsList;
import com.stackroute.fullstackassignment.repository.FriendsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    FriendsRepo friendsRepo;
    @Override
    public FriendsList addFriend(FriendsList friendsList) {
        FriendsList friendsList1= friendsRepo.save(friendsList);
        return friendsList1;
    }

    @Override
    public boolean deleteFriend(FriendsList friendsList) {
        return false;
    }

    @Override
    public FriendsList searchFriendById(Long id) {
        return null;
    }

    @Override
    public List<FriendsList> getAllFriendsList() {
        return null;
    }
}
