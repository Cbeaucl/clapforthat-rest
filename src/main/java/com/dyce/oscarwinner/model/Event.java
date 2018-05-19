package com.dyce.oscarwinner.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue
    Long eventId;
    String name;
    LocalDateTime startTime;
    Boolean active;
}
