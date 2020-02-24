package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaTypeDto {
    private long id;
    private String mediaTypeName;
    private List<MediaSubTypeDto> mediaSubTypeDtos;

    public MediaTypeDto(MediaType mediaType) {
        this.id = mediaType.getId();
        this.mediaTypeName = mediaType.getMediaTypeName();
        this.mediaSubTypeDtos.addAll(
                mediaType.getMediaSubTypes().stream()
                        .map(MediaSubTypeDto::new)
                        .collect(Collectors.toList())
        );
    }
}
