package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private MediaTypeDto defaultMediaType;
    private List<CustomMediaTrackerDto> customMediaTrackers;

    public UserDto(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.defaultMediaType = new MediaTypeDto(user.getDefaultMediaType());
        this.customMediaTrackers = user.getCustomMediaTrackers()
                .stream()
                .map(CustomMediaTrackerDto::new)
                .collect(Collectors.toList());
    }
}
