package com.oni.bookkeeping.dto;

import com.oni.bookkeeping.entity.UserTrackedMedia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserTrackedMediaDto {
    private long id;
    private MediaDto media;
    private boolean wishlist;
    private boolean owned;

    public UserTrackedMediaDto(UserTrackedMedia userTrackedMedia) {
        this.id = userTrackedMedia.getId();
        this.media = new MediaDto(userTrackedMedia.getMedia());
        this.wishlist = userTrackedMedia.isWishlist();
        this.owned = userTrackedMedia.isOwned();
    }
}
