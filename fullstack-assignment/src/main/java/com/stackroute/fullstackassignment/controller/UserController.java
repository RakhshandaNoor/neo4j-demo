package com.stackroute.fullstackassignment.controller;

import com.stackroute.fullstackassignment.domain.Users;
import com.stackroute.fullstackassignment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@RequestMapping(value= "/api/v1")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
public ResponseEntity<?> createUser(@RequestBody Users users){
        ResponseEntity responseEntity;

        Users user1= userService.addUser(users);

       responseEntity= new ResponseEntity<Users>(user1, HttpStatus.ACCEPTED);
        return responseEntity;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        ResponseEntity responseEntity;

       Users users=  userService.searchUserById(id);
        responseEntity= new ResponseEntity<Users>(users, HttpStatus.ACCEPTED);
        return responseEntity;
    }

    @DeleteMapping("user")
    public ResponseEntity<?> deleteUserById( @RequestBody Users users){
        ResponseEntity<Users> responseEntity;

        Users user1= userService.deleteUserById(users);
        responseEntity = new ResponseEntity<>(user1, HttpStatus.OK);


        return responseEntity;
    }

    @PutMapping("users")
    public ResponseEntity<?> updateUser( @RequestBody Users users){
        ResponseEntity<Users> responseEntity;

        Users user1= userService.updateUser(users);
        responseEntity = new ResponseEntity<>(user1, HttpStatus.OK);


        return responseEntity;
    }


}
