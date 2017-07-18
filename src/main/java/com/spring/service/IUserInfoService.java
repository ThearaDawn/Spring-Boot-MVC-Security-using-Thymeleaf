package com.spring.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.spring.entity.Article;

public interface IUserInfoService {
	 @Secured ({"ROLE_ADMIN"})
     List<Article> getAllUserArticles();
}
