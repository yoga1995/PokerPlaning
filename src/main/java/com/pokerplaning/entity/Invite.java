package com.pokerplaning.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Invite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invite_id", nullable = false)
    private Long inviteId;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session sessionId;

    @Column(name = "your-name")
    private String yourName;
}
