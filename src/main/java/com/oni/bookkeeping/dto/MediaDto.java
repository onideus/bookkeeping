package com.oni.bookkeeping.dto;

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
}
