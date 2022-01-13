package com.pokerplaning.service;

import com.pokerplaning.dto.UserStoryResponse;
import com.pokerplaning.dto.UserStorydto;
import com.pokerplaning.entity.UserStory;
import com.pokerplaning.exception.CustomErrorCode;
import com.pokerplaning.exception.CustomException;
import com.pokerplaning.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStoryServiceImpl implements UserStoryService{

    @Autowired
    private UserStoryRepository userStoryRepository;

    @Override
    public UserStoryResponse createUserStory(UserStorydto userStorydto) {
        if(userStorydto == null) {
            throw new CustomException(CustomErrorCode.BAD_ARGS, "user Story Details shouldn't be empty");
        }
        UserStory userStory = new UserStory();
        userStory.setUserStoryId(userStorydto.getUserStoryId());
        userStory.setUserStoryDesc(userStorydto.getUserStoryDes());
        UserStory story = userStoryRepository.save(userStory);

        UserStoryResponse userStoryResponse = new UserStoryResponse();
        userStoryResponse.setUserStoryId(Long.valueOf(story.getUserStoryId()));
        userStoryResponse.setMessage("userStory has been created!!");

        return userStoryResponse;
    }

    @Override
    public UserStoryResponse deleteUserStory(Long userStoryId) {

        if(userStoryId == null) {
            throw new CustomException(CustomErrorCode.BAD_ARGS, "user Story Id shouldn't be empty");
        }
        UserStoryResponse userStoryResponse = new UserStoryResponse();
        userStoryRepository.delete(userStoryId);
        userStoryResponse.setUserStoryId(userStoryId);
        userStoryResponse.setMessage("UserStory " + userStoryId +  "has been successfully delete ");
        return userStoryResponse;
    }
}
