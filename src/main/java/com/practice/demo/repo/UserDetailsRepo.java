package com.practice.demo.repo;

import com.practice.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
