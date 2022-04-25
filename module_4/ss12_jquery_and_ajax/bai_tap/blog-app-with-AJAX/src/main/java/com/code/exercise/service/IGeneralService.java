package com.code.exercise.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void Save(T t);

    void remove(Long id);
}
