package com.educandoweb.coursejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.coursejpa.entities.User;

@Repository//não precisariamos colocar a notação repository
//pois o JpaRepository ta está registrado como um componente gerenciado pelo Spring
public interface UserRepository extends JpaRepository<User, Long> {


}
