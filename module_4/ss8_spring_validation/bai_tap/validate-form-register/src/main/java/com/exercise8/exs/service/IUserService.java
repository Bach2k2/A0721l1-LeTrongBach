package com.exercise8.exs.service;

import com.exercise8.exs.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface IUserService {
    Iterable<User> findAll();

    Optional<User> findById(Long id);

    void save(User user);

    void remove(Long id);
}
