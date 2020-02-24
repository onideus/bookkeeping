package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity(name = "CustomMediaTracker")
@Table(name = "custom_media_tracker")
@Data
@NoArgsConstructor
public class CustomMediaTracker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnoreProperties
    private User user;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "media_completed_tracker_join",
            joinColumns = @JoinColumn(name = "custom_tracker_id"),
            inverseJoinColumns = @JoinColumn(name = "completed_media_id")
    )
    @JsonIgnoreProperties({"customMediaTrackerList", "user", "media", "hibernateLazyInitializer"})
    private List<MediaCompleted> mediaCompletedList;
    private String trackerName;
    private int goal;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
}
