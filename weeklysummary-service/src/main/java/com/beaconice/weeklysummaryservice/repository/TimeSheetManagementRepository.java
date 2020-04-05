package com.beaconice.weeklysummaryservice.repository;

import com.beaconice.weeklysummaryservice.entity.TimeSheetManagement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TimeSheetManagementRepository extends MongoRepository<TimeSheetManagement, String> {

    Optional<TimeSheetManagement> findByUsername(String username);

}
