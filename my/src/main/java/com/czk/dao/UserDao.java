package com.czk.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.czk.entity.User;

@Repository
public interface UserDao {

	//添加用户
	public Integer insertUser(User user);
	
	//查询用户
	public List<User> seleteUser();
	
	//删除用户
	public Integer deleteUser(@Param("name") String name);
	
	//修改用户
	public Integer updateUser(User user);
	
	
}
