package com.stackroute.fullstackassignment.services;

import com.stackroute.fullstackassignment.domain.Users;

import java.util.List;

public interface UserService {
    public Users addUser(Users user);
    public Users deleteUserById(Users user);
    public Users updateUser(Users user) ;
    public Users searchUserById(Long id);
    public List<Users> getAllUsers();
}
