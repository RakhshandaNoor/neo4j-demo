package com.stackroute.fullstackassignment.controller;

import com.stackroute.fullstackassignment.domain.FriendsList;
import com.stackroute.fullstackassignment.domain.Users;
import com.stackroute.fullstackassignment.services.FriendService;
import com.stackroute.fullstackassignment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FriendController  {

    FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @PostMapping("/friendlist")
    public ResponseEntity<?> createUser(@RequestBody FriendsList friendsList){
        ResponseEntity responseEntity;

        FriendsList friendsList1 = friendService.addFriend(friendsList);

        responseEntity= new ResponseEntity<FriendsList>(friendsList1, HttpStatus.ACCEPTED);
        return responseEntity;
    }
}
