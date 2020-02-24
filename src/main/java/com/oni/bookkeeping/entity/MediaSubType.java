package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "MediaSubType")
@Table(name = "media_sub_type")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MediaSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mediaSubTypeName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("mediaSubTypes")
    private MediaType mediaType;
}
