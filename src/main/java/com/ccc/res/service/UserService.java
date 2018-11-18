package com.ccc.res.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ccc.res.dto.User;
import com.ccc.res.repositry.UserRepository;


@Service("userDetailsService")
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return (UserDetails) userRepository.findOneByUsername(username);
    }

    public User addUser(User u) {
        return userRepository.save(u);
    }

    public void deleteUser(User u) {
        userRepository.delete(u);
    }

}
