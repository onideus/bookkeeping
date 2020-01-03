package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
