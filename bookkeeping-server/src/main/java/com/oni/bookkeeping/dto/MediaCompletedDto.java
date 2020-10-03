package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.MediaCompleted;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaCompletedDto {
    private long id;
    private MediaDto media;
    private String mediaCompletedDate;

    public OffsetDateTime getMediaCompletedDateConverted() {
        return mediaCompletedDate == null ? null : OffsetDateTime.parse(mediaCompletedDate);
    }

    public MediaCompletedDto(MediaCompleted mediaCompleted) {
        this.id = mediaCompleted.getId();
        this.media = new MediaDto(mediaCompleted.getMedia());
        this.mediaCompletedDate = Optional.ofNullable(mediaCompleted.getMediaCompletedDate()).isPresent()
                ? mediaCompleted.getMediaCompletedDate().toString()
                : null;
    }
}
