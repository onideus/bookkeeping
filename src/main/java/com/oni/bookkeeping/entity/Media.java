package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "Media")
@Table(name = "media")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "mediaSubTypes"})
    private MediaType mediaType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "mediaType"})
    private MediaSubType mediaSubType;
    private String mediaTitle;
    private byte[] mediaImage;
}
