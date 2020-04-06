package com.beaconice.contactservice.repository;

import com.beaconice.contactservice.domain.Contact;
import com.beaconice.contactservice.domain.Emergency;
import com.beaconice.contactservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyRepository {

    public User UpdateContact(User user, Contact contact);
    public User UpdateEmergencyContact(User user,Emergency emergency);
}
