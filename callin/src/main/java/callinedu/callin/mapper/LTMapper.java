package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.LT;

@Mapper
public interface LTMapper {
	
	public List<LT> getLTList();
		
}