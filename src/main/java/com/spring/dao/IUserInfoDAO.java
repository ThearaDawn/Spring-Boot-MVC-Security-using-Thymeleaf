package com.spring.dao;
import java.util.List;

import com.spring.entity.Article;
import com.spring.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
	List<Article> getAllUserArticles();
}