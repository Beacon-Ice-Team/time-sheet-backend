package com.beaconice.contactservice.repository;

import com.beaconice.contactservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {


    public User findByUsername(String username);



}