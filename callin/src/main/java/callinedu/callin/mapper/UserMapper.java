package callinedu.callin.mapper;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.User;

@Mapper
public interface UserMapper {

	public User getUserInfoById(String userId);

	public User idDuplicateCheck(String userId);
}
