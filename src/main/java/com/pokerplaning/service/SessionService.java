package com.pokerplaning.service;

import com.pokerplaning.dto.SessionRequestDto;
import com.pokerplaning.dto.SessionRespone;

public interface SessionService {

   public SessionRespone createSession(SessionRequestDto sessionRequestDto);
}
