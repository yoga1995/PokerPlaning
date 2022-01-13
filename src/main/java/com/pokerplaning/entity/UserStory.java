package com.pokerplaning.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "story_id", nullable = false)
    private Long storyId;

    @Column(name = "user_story_name", nullable = false)
    private String userStoryId;

    @Column(name = "user_story_desc", nullable = false)
    private String userStoryDesc;

    @Column(name = "session_id", nullable = false)
    private Session sessionId;
}
