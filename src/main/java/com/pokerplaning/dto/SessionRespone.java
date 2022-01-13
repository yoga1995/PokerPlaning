package com.pokerplaning.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SessionRespone {

    private String sessioName;
    private int cardNumbers[];

    private List<UserStorydto> userStorydtoList;

    public void getCardNumbers(int[] cardNumbers) {
    }
}
