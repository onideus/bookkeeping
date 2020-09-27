package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.UserTrackedMedia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTrackedMediaRepository extends CrudRepository<UserTrackedMedia, Long> {
}
