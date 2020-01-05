package com.oni.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "media_type")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mediaType;

}
