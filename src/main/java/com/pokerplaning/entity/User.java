package com.pokerplaning.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*  private EntityId userId;
    @Field(UserEntityDef.ADMIN)
    private Boolean admin;
    @Field(UserEntityDef.CONNECTED)
    private Boolean connected;*/
}
