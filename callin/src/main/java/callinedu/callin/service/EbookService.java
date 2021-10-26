package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.EbookData;
import callinedu.callin.domain.EbookLevel;
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
	
	//교재삭제
	public int deleteEbookList(String ebookDataCode) {
		return ebookMapper.deleteEbookList(ebookDataCode);
	}
	
	//교재등록
	public int ebookRegister(Map<String, Object> map) {
		String ebookDataCode = (String) map.get("ebookDataCode");
		String ebookName = (String) map.get("ebookName");
		String ebookLevel = (String) map.get("ebookLevel");
		String ebookFile = (String) map.get("ebookFile");
		String registrationDate = (String) map.get("registrationDate");
		String managerId = (String) map.get("managerId");
		
		return ebookMapper.ebookRegister(ebookDataCode,ebookName,ebookLevel,ebookFile,registrationDate,managerId);
	}





	  
	 
}
