package com.oni.bookkeeping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomMediaTrackerDto {
    private long id;
    private UserDto userDto;
    private List<MediaCompletedDto> mediaCompletedDtos;
    private String trackerName;
    private int goal;
    private String startDate;
    private String endDate;

    public OffsetDateTime getStartDateConverted() {
        return OffsetDateTime.parse(startDate);
    }

    public OffsetDateTime getEndDateConverted() {
        return OffsetDateTime.parse(endDate);
    }
}
