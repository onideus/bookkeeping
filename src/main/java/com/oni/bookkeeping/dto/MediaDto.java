package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.Media;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaDto {
    private long id;
    private MediaTypeDto mediaType;
    private MediaSubTypeDto mediaSubType;
    private String mediaTitle;
    private byte[] mediaImage;

    public MediaDto(Media media) {
        this.id = media.getId();
        this.mediaType = new MediaTypeDto(media.getMediaType());
        this.mediaSubType = new MediaSubTypeDto(media.getMediaSubType());
        this.mediaTitle = media.getMediaTitle();
        this.mediaImage = media.getMediaImage();
    }
}
