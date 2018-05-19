package com.dyce.oscarwinner.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class UserGroup {
    @Id
    @GeneratedValue
    Long groupId;
    String name;
    String description;
    @ManyToMany(mappedBy = "groups")
    List<AppUser> users = new ArrayList<>();
    public UserGroup(){};
    public UserGroup(String name, String description) {
        this.name = name;
        this.description = description;
    }



}

