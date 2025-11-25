package com.educandoweb.coursejpa.repository;

import com.educandoweb.coursejpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
