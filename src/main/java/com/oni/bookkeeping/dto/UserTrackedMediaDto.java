package com.oni.bookkeeping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTrackedMediaDto {
    private long id;
    private UserDto userDto;
    private MediaDto mediaDto;
    private boolean wishlist;
    private boolean owned;
}
