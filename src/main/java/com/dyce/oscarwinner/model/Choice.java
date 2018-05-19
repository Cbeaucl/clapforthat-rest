package com.dyce.oscarwinner.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Choice {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long choiceId;
    @ManyToOne
    @JoinColumn
    AppUser user;
    @ManyToOne
    @JoinColumn
    Category category;
    @ManyToOne
    @JoinColumn
    Nominee nominee;

    public Choice(){};
}
