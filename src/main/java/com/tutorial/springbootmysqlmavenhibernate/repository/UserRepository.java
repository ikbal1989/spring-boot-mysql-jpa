package com.tutorial.springbootmysqlmavenhibernate.repository;

import com.tutorial.springbootmysqlmavenhibernate.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
