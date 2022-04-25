package com.code.exercise.service.blog;

import com.code.exercise.model.Blog;
import com.code.exercise.model.Category;
import com.code.exercise.service.IGeneralService;

public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByProvince(Category category);

}
