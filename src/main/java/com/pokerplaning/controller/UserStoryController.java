package com.pokerplaning.controller;

import com.pokerplaning.dto.UserStoryResponse;
import com.pokerplaning.dto.UserStorydto;
import com.pokerplaning.entity.UserStory;
import com.pokerplaning.service.UserStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserStoryController {
//test
    @Autowired
    private UserStoryService userStoryService;

    @PostMapping(value = "/addUserStory")
    public ResponseEntity<UserStoryResponse> createUserStory(@RequestBody UserStorydto userStorydto){

        return new ResponseEntity(userStoryService.createUserStory(userStorydto), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/deleteUserStory/{userStoryId}")
    public ResponseEntity<UserStoryResponse> deleteUserStory(@PathVariable Long userStoryId ) {

        return new ResponseEntity(userStoryService.deleteUserStory(userStoryId),HttpStatus.CREATED);

    }
}
