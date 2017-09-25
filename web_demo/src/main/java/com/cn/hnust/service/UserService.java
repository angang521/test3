package com.cn.hnust.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.pojo.User;



@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User getUserById(String userId) {
		
		User user = new User();
		user.setAccount("007");
		user.setPwd("0007");
		return user;
	}

	public List<User> getUserInfo() {
		return userDao.getUserInfo();
		
	}

}
