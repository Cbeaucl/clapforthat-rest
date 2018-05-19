package com.dyce.oscarwinner.repository;

import com.dyce.oscarwinner.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
