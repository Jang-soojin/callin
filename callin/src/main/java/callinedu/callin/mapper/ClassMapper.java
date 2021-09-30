package callinedu.callin.mapper;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.ClassPolicy;

@Mapper
public interface ClassMapper {
	public int addClassPolicy(ClassPolicy classPolicy);
	
	public ClassPolicy classPolicyNameCheck(ClassPolicy classPolicy);
}