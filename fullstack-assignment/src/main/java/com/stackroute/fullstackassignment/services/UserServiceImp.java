package com.stackroute.fullstackassignment.services;


import com.stackroute.fullstackassignment.domain.Users;
import com.stackroute.fullstackassignment.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UsersRepo usersRepo;
    @Override
    public Users addUser(Users user) {
        Users user1= usersRepo.save(user);
        return user1;
    }

    @Override
    public Users deleteUserById(Users user) {
        return null;
    }

    @Override
    public Users updateUser(Users user) {
        return null;
    }

    @Override
    public Users searchUserById(Long id) {
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }
}
