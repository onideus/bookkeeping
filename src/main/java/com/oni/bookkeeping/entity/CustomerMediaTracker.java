package com.oni.bookkeeping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "CustomMediaTracker")
@Table(name = "custom_media_tracker")
@Data
@NoArgsConstructor
public class CustomerMediaTracker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private String trackerName;
    private int goal;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
}
