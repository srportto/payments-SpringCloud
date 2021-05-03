package com.devsuperior.hruser.repositories;

import com.devsuperior.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<User, Long> {
}
