package com.dyce.oscarwinner.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Nominee {
    @Id @GeneratedValue
    Long nomineeId;
    String firstName;
    String lastName;
    String knownFor;
}
