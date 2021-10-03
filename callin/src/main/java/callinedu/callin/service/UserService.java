package callinedu.callin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.User;
import callinedu.callin.mapper.UserMapper;

@Service
public class UserService {
	
	public final UserMapper userMapper;
	
	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User getUserInfoById(String userId) {
		User userInfo = userMapper.getUserInfoById(userId);
		return userInfo;
	}

}