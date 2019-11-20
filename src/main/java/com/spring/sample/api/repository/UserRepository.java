package com.spring.sample.api.repository;

import com.spring.sample.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByEmail(String email);
    List<User> findAllByLastname(String lastname);

}
