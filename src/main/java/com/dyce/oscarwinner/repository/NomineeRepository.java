package com.dyce.oscarwinner.repository;

import com.dyce.oscarwinner.model.Nominee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomineeRepository extends JpaRepository<Nominee, Long> {
}
