package com.exercise.practice.repository;

import com.exercise.practice.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository <Product,Long>{

}
