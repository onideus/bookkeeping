package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "MediaType")
@Table(name = "media_type")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class MediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mediaType;
    @OneToMany(
            mappedBy = "mediaType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnoreProperties("mediaType")
    private List<MediaSubType> mediaSubTypes = new ArrayList<>();
}
