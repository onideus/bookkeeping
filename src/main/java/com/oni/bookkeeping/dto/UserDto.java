package com.oni.bookkeeping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private MediaTypeDto defaultMediaType;
    private List<CustomMediaTrackerDto> customMediaTrackerDtos;
}
