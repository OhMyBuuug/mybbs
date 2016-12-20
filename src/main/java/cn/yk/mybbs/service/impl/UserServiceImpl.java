package cn.yk.mybbs.service.impl;

import javax.annotation.Resource;

import cn.yk.mybbs.dao.user_testMapper;
import cn.yk.mybbs.model.user_test;
import cn.yk.mybbs.dao.user_testMapper;
import cn.yk.mybbs.model.user_test;
import org.springframework.stereotype.Service;

import cn.yk.mybbs.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private user_testMapper user_tMapper;
	
	public user_test getUserById(int userId) {
		 return this.user_tMapper.selectByPrimaryKey(userId);
	}

}
