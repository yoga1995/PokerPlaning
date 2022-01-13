package com.pokerplaning.dto;

import lombok.Data;

@Data
public class SessionRequestDto {

    private String Sessionname;
    private int cardNumers[] = {2,4,6,8};
    private String cardSet = "fibonacci";
}
