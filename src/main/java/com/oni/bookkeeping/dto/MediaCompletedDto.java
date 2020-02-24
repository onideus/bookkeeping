package com.oni.bookkeeping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MediaCompletedDto {
    private long id;
    private UserDto userDto;
    private MediaDto mediaDto;
    private List<CustomMediaTrackerDto> customMediaTrackerDtos;
    private String mediaCompletedDate;

    public OffsetDateTime getMediaCompletedDateConverted() {
        return OffsetDateTime.parse(mediaCompletedDate);
    }
}
