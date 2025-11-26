package com.educandoweb.coursejpa.repositories;

import com.educandoweb.coursejpa.entities.Category;
import com.educandoweb.coursejpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
