package de.gagan.jpa.learnjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import de.gagan.jpa.learnjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
