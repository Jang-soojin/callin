package callinedu.callin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.mapper.ClassMapper;

@Service
public class ClassService {
	
	private static final Logger log = LoggerFactory.getLogger(ClassService.class);

	public final ClassMapper classMapper;
	
	public ClassService(ClassMapper classMapper) {
		this.classMapper = classMapper;
	}
	
	public int addClassPolicy(ClassPolicy classPolicy) {
		return classMapper.addClassPolicy(classPolicy);
	}
	
	public ClassPolicy classPolicyNameCheck(ClassPolicy classPolicy) {
	    ClassPolicy c =	classMapper.classPolicyNameCheck(classPolicy);
	    return c;
	}
	
	public List<ClassPolicy> searchPolicyList(String classPeriod, String classDay, String classTime, String className) {
		
		List<ClassPolicy> classPolicyList = classMapper.searchPolicyList(classPeriod, classDay, classTime, className);
		
		log.info("searchPolicyList 검색해서 나온 리스트 : {}", classPolicyList);
		
		return classPolicyList;
	}
	public List<ClassPolicy> getClassPolicy(){
	      List<ClassPolicy> classPolicy = classMapper.getClassPolicy();
	      return classPolicy;
	   }
}
