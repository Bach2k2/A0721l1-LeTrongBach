package com.module.repository;

import com.module.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
    Iterable<Category> findAllByNameAndId(String name,Long id);
}
