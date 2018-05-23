package com.dyce.oscarwinner.repository;

import com.dyce.oscarwinner.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
@RestResource(exported = false)
public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByEmail(String email);
}
