package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.EbookData;

@Mapper
public interface EbookMapper {

	//교재목록조회
	List<EbookData> getEbookListBySearchKey(String searchKey, String searchValue);


}
