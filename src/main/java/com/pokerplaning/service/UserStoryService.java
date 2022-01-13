package com.pokerplaning.service;

import com.pokerplaning.dto.UserStoryResponse;
import com.pokerplaning.dto.UserStorydto;
import com.pokerplaning.entity.UserStory;

public interface UserStoryService {
    UserStoryResponse createUserStory(UserStorydto userStorydto);

    UserStoryResponse deleteUserStory(Long userStoryId);
}
