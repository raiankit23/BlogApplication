package com.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.OptionalInt;

public interface Role extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
