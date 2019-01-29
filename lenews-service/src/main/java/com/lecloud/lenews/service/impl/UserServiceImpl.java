package com.lecloud.lenews.service.impl;

import com.lecloud.lenews.dao.UserDao;
import com.lecloud.lenews.domain.UserBean;
import com.lecloud.lenews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
	private UserDao userDao;

	public boolean login(UserBean user) {
		int result =userDao.login(user);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}
}
