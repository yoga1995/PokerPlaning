package com.pokerplaning.service;

import com.pokerplaning.dto.SessionRequestDto;
import com.pokerplaning.dto.SessionRespone;
import com.pokerplaning.dto.UserStorydto;
import com.pokerplaning.entity.Session;
import com.pokerplaning.entity.UserStory;
import com.pokerplaning.enums.CardSetEnum;
import com.pokerplaning.exception.CustomErrorCode;
import com.pokerplaning.exception.CustomException;
import com.pokerplaning.repository.SessionRepository;
import com.pokerplaning.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private UserStoryRepository userStoryRepository;

    @Override
    public SessionRespone createSession(SessionRequestDto sessionRequestDto) {

        if (sessionRequestDto == null) {
            throw new CustomException(CustomErrorCode.BAD_ARGS, "Session should not be null");
        }

        if (CardSetEnum.toEnum(sessionRequestDto.getCardSet()) == null) {
            throw new CustomException(CustomErrorCode.BAD_ARGS, "CardSet should not be null");
        }

        Session session = new Session();
        SessionRespone sessionRespone = new SessionRespone();
        session.setSessionName(sessionRequestDto.getSessionname());
        session.setCardNumbers(sessionRequestDto.getCardNumers());

        Session sessionId = sessionRepository.save(session);
        sessionRespone.setSessioName(sessionId.getSessionName());
        sessionRespone.getCardNumbers(sessionId.getCardNumbers());

        List<UserStory> userStoryList = userStoryRepository.findAll();

        userStoryList.forEach(story -> {
            sessionRespone.setUserStorydtoList((List<UserStorydto>) new UserStorydto(story));
        });


        return (SessionRespone) sessionRepository;
    }
}
