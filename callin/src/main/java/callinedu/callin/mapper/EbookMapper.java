package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.EbookData;

@Mapper
public interface EbookMapper {

	//교재조회
	public List<EbookData> getEbookList();
	//교재목록검색
	public List<EbookData> getEbookListBySearchKey(String searchKey, String searchValue);
	//교재삭제
	public int deleteEbookList(String ebookDataCode);
	


}
