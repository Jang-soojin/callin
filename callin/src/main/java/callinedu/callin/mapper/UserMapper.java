package callinedu.callin.mapper;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.User;

@Mapper
public interface UserMapper {

	public User getUserInfoById(String userId);

	public User idDuplicateCheck(String userId);

	public int addUser(String id, String pw, String name, String nickname, String skypeId, String birth, String gender, String email, String phoneNumber);
}
