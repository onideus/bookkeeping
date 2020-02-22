package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.MediaCompleted;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaCompletedRepository extends CrudRepository<MediaCompleted, Long> {
}
