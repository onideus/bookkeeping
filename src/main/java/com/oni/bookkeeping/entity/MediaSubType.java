package com.oni.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "media_sub_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long mediaTypeId;
    private String mediaSubType;
}
