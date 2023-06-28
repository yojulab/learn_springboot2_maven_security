package com.learn.learn_springboot_security.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.learn_springboot_security.Entities.Users;

public interface UsersRepository extends JpaRepository<Users, String> {
}