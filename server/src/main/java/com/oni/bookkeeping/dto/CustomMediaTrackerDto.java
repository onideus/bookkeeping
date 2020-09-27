package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.CustomMediaTracker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomMediaTrackerDto {
    private long id;
    private List<MediaCompletedDto> mediaCompletedList;
    private String trackerName;
    private int goal;
    private String startDate;
    private String endDate;

    public OffsetDateTime getStartDateConverted() {
        return startDate == null ? null : OffsetDateTime.parse(startDate);
    }

    public OffsetDateTime getEndDateConverted() {
        return endDate == null ? null : OffsetDateTime.parse(endDate);
    }

    public CustomMediaTrackerDto(CustomMediaTracker customMediaTracker) {
        this.id = customMediaTracker.getId();
        this.mediaCompletedList = customMediaTracker.getMediaCompletedList()
                .stream()
                .map(MediaCompletedDto::new)
                .collect(Collectors.toList());
        this.trackerName = customMediaTracker.getTrackerName();
        this.goal = customMediaTracker.getGoal();
        this.startDate = Optional.ofNullable(customMediaTracker.getStartDate()).isPresent()
                ? customMediaTracker.getStartDate().toString()
                : null;
        this.endDate = Optional.ofNullable(customMediaTracker.getEndDate()).isPresent()
                ? customMediaTracker.getEndDate().toString()
                : null;
    }
}
