package com.devsuperior.hroauth.repositories;

import com.devsuperior.hroauth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

}
