package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaTypeDto {
    private long id;
    private String mediaTypeName;

    public MediaTypeDto(MediaType mediaType) {
        this.id = mediaType.getId();
        this.mediaTypeName = mediaType.getMediaTypeName();
    }
}
