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
	public User idDuplicateCheck(String userId) {
		User duplicateCheck = userMapper.idDuplicateCheck(userId);
		if(duplicateCheck==null) {
			User user = new User();
			user.setUserId("사용가능");
			return user;
		}else {
			return duplicateCheck;
		}
	}

	public void addUser(String id, String pw, String name, String nickname, String skypeId, String birth, String gender, String email, String phoneNumber) {
		userMapper.addUser(id, pw, name, nickname, skypeId, birth, gender, email, phoneNumber);
	}

}
