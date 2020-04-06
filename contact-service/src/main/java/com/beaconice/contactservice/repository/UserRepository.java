package com.beaconice.contactservice.repository;

import com.beaconice.contactservice.domain.Contact;
import com.beaconice.contactservice.domain.User;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> , MyRepository {


    public User findByUsername(String username);

//    @Query("update User u set u.contact = ?1 where u.username = ?2")
//    void setContactByUsername(Contact contact, String username);

//    @Modifying
//    @Query("update User u set u.contact = ?1 where u.username = ?2")
//    void setUserInfoById(Contact contact, String username);
}