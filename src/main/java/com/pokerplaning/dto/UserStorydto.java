package com.pokerplaning.dto;

import com.pokerplaning.entity.UserStory;
import lombok.Data;

@Data
public class UserStorydto {

    private String userStoryId;
    private String userStoryDes;

    public UserStorydto(UserStory userStory) {
        this.userStoryId = userStoryId;
        this.userStoryDes = userStoryDes;
    }
}
