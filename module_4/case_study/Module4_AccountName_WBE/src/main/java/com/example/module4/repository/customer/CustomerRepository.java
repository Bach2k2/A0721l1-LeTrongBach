package com.example.module4.repository;


import com.example.module4.model.Customer;
import com.example.module4.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>{

}
