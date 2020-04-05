package com.beaconice.timesheetservice.repository;

import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TimeSheetRepository extends MongoRepository<TimeSheetManagement, String> {

    Optional<TimeSheetManagement> findByUsername(String username);
}
