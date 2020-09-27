package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.MediaSubType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaSubTypeDto {
    private long id;
    private String mediaSubTypeName;

    public MediaSubTypeDto(MediaSubType mediaSubType) {
        this.id = mediaSubType.getId();
        this.mediaSubTypeName = mediaSubType.getMediaSubTypeName();
    }
}
