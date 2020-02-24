package com.oni.bookkeeping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "UserTrackedMedia")
@Table(name = "user_tracked_media")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class UserTrackedMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    @JsonIgnoreProperties("hibernateLazyInitializer")
    private Media media;
    private boolean wishlist;
    private boolean owned;
}
