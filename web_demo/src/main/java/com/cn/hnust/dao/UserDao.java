package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cn.hnust.pojo.User;

@Component
public interface UserDao {
	public User getUserByUserId();

	public List<User> getUserInfo();

}
