package com.oni.bookkeeping.repository;

import com.oni.bookkeeping.entity.MediaType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaTypeRepository extends CrudRepository<MediaType, Long> { }
