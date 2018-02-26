package com.example.sqlmaven;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository< Users , Integer > {
     //List<Users> findAll();
    // Users findByName(Users user);
     Users findByName(String name);
}
