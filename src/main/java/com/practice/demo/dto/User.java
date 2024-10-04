package com.practice.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "users")
@Getter
@Setter
@ToString
public class User {

    @Id
    private int id;
    private String username;
    private String password;

}
