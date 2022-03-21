package com.example.practice.repository;

import com.example.practice.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone,Long> {

}
