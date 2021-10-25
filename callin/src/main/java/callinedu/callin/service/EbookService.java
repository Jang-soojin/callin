package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.EbookData;
import callinedu.callin.mapper.EbookMapper;

@Service
public class EbookService {
	
	  public final EbookMapper ebookMapper;
	  
	  @Autowired
	  public EbookService(EbookMapper ebookMapper) {
		  this.ebookMapper = ebookMapper;
	  }
	  
	  //교재조회
	  public List<EbookData> getEbookList() {
		  List<EbookData> ebookList = ebookMapper.getEbookList();
		  return ebookList;
	  }
	  
	  
	  //교재목록검색
	  public List<EbookData> getEbookListBySearchKey(Map<String,Object> map){
		  
		  String searchKey = (String)map.get("searchKey");
		  String searchValue = (String)map.get("searchValue");
		  
		  List<EbookData> searchEbookList = ebookMapper.getEbookListBySearchKey(searchKey,searchValue);
		  
	  return searchEbookList;
	  }




	  
	 
}
