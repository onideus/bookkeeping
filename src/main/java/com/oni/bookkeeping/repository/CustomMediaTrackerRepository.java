package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.CustomMediaTracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomMediaTrackerRepository extends CrudRepository<CustomMediaTracker, Long> {
}
