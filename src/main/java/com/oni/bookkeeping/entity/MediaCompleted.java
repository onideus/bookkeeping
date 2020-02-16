package com.oni.bookkeeping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

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
    private User user;
    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    private Media media;
    private OffsetDateTime completedDate;
}
