package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.LT;
import callinedu.callin.domain.LTApplyCode;

@Mapper
public interface LTMapper {
	
	public List<LT> getLTList();
	
	public List<LTApplyCode> getLTApplyListBySearchKey(String levelSearchKey, String lTApplySearchValue);
	
	public List<LT> getLTListDetail();
		
	public List<LT> LTListMynote();
	
}
