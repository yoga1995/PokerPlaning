package com.pokerplaning.entity;

import com.pokerplaning.enums.CardSetEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "session_id", nullable = false)
    private Long sessionId;

    @Column(name = "session_name", nullable = false)
    private String sessionName;

    @Column(name = "card_numbers", nullable = false)
    private int cardNumbers[];

    @Column(name = "card_set", nullable = false)
    private CardSetEnum cardSet;

}
