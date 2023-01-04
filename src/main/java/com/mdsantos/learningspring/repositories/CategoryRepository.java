package com.mdsantos.learningspring.repositories;

import com.mdsantos.learningspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
