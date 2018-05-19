package com.dyce.oscarwinner.repository;

import com.dyce.oscarwinner.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
