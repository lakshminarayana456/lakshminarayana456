package com.practice.demo.service;

import com.practice.demo.dto.User;
import com.practice.demo.dto.UserPrincipal;
import com.practice.demo.repo.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDetailsRepo.findByUsername(username);
        if(user ==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User Not found");
        }
        return new UserPrincipal(user);
    }
}
