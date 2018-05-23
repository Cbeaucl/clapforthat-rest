package com.dyce.oscarwinner.controller;


import com.dyce.oscarwinner.model.AppUser;
import com.dyce.oscarwinner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
        @Autowired
        private UserRepository applicationUserRepository;
        private BCryptPasswordEncoder bCryptPasswordEncoder;

        public UserController(UserRepository applicationUserRepository,
                              BCryptPasswordEncoder bCryptPasswordEncoder) {
            this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        }

        @PostMapping("/sign-up")
        public void signUp(@RequestBody AppUser user) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            applicationUserRepository.save(user);
        }
    }

