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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnoreProperties("hibernateLazyInitializer")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    @JsonIgnoreProperties("hibernateLazyInitializer")
    private Media media;
    @ManyToMany(mappedBy = "mediaCompletedList", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"mediaCompletedList", "user", "media", "hibernateLazyInitializer"})
    private List<CustomMediaTracker> customMediaTrackerList;
    private OffsetDateTime mediaCompletedDate;
}
