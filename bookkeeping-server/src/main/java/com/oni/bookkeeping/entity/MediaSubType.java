package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "MediaSubType")
@Table(name = "media_sub_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaSubType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mediaSubTypeName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"mediaSubTypes", "mediaTypes"})
    private MediaType mediaType;

    @Override
    public String toString() {
        return "MediaSubType{" +
                "id=" + id +
                ", mediaSubTypeName='" + mediaSubTypeName + '\'' +
                '}';
    }
}
