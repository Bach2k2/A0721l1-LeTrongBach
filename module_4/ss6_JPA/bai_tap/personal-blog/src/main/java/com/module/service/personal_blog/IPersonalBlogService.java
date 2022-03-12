package com.module.service.personal_blog;

import com.module.model.PersonalBlog;
import com.module.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonalBlogService extends IGeneralService<PersonalBlog> {
}
