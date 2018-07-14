package com.dyce.oscarwinner;

import com.dyce.oscarwinner.model.AppUser;
import com.dyce.oscarwinner.model.UserGroup;
import com.dyce.oscarwinner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoadDatabase implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("IT WORKS");
        AppUser user = new AppUser("First", "Name", "chrisbe@gadasf.ca", "Meeeep", "chrisbe@gadasf.ca");
        userRepository.saveAndFlush(user);
        UserGroup group = new UserGroup();
        group.setName("HULLo");
        user.getGroups().add(group);
        userRepository.saveAndFlush(user);
        List<AppUser> users = userRepository.findAll();



    }
}
