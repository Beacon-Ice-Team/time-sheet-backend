package com.beaconice.timesheetservice.repository;

import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimeSheetRepository extends MongoRepository<TimeSheetManagement, String> {
}
