package com.pokerplaning.controller;

import com.pokerplaning.dto.SessionRequestDto;
import com.pokerplaning.dto.SessionRespone;
import com.pokerplaning.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class SessionCotroller {

    @Autowired
    private SessionService sessionService;

    @PostMapping(path = "/createSession")
    public ResponseEntity<SessionRespone> createSession(@RequestBody SessionRequestDto sessionRequestDto) {

        return new ResponseEntity<>( sessionService.createSession(sessionRequestDto), HttpStatus.CREATED);
    }
}

