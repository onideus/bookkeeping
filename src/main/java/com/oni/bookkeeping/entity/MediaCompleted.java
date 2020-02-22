package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity(name = "MediaCompleted")
@Table(name = "media_completed")
@Data
@NoArgsConstructor
public class MediaCompleted {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnoreProperties
    private User user;
    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    private Media media;
    @ManyToMany(mappedBy = "mediaCompletedList")
    @JsonIgnoreProperties("mediaCompleted")
    private List<CustomMediaTracker> customMediaTrackerList;
    private OffsetDateTime mediaCompletedDate;
}
