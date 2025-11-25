package com.educandoweb.coursejpa.repositories;

import com.educandoweb.coursejpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
