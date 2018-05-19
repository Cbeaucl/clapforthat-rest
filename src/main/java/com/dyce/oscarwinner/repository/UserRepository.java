package com.dyce.oscarwinner.repository;

import com.dyce.oscarwinner.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, String> {
}
