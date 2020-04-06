package com.beaconice.contactservice.repository;

import com.beaconice.contactservice.domain.Contact;
import com.beaconice.contactservice.domain.Emergency;
import com.beaconice.contactservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

public class MyRepositoryImpl implements MyRepository {
    private MyRepository myRepository;
    public User UpdateContact(User user, Contact contact){
        user.setContact(contact);
        return user;

    }
    public User UpdateEmergencyContact(User user, Emergency emergency){
        user.setEmergency(emergency);
        return user;
    }
}
