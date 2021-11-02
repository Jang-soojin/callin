package callinedu.callin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.ClassApply;
import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.domain.RegularClass;
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
	
	public int deleteClassPolicy(String classPolicyCode) {
		
		return classMapper.deleteClassPolicy(classPolicyCode);
	}
	
	public int modifyPolicy(ClassPolicy classPolicy) {
		
		return classMapper.modifyPolicy(classPolicy);
	}
	
	public ClassPolicy getPolicyInfoByCode(String classPolicyCode) {
		return classMapper.getPolicyInfoByCode(classPolicyCode);
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


	public List<ClassPolicy> getClassPolicyListBySearchKey(String levelSearchKey, String classPolicySearchValue) {
		System.out.println(levelSearchKey + "<--------------------------------------입력받은 서치키");
		System.out.println(classPolicySearchValue + "<--------------------------------------입력받은 값");
		if("policyName".equals(levelSearchKey)) 	levelSearchKey = "class_policy_name";
		if("classPeriod".equals(levelSearchKey)) 	levelSearchKey = "class_period";
		if("classTime".equals(levelSearchKey))		levelSearchKey = "class_time";
		return classMapper.getClassPolicyListBySearchKey(levelSearchKey, classPolicySearchValue);
	}

	public int addRegularClass(RegularClass regularClass) {
		// TODO Auto-generated method stub
		return classMapper.addRegularClass(regularClass);
	}

	public List<RegularClass> getRegularClass() {
		List<RegularClass> regularClass = classMapper.getRegularClass();
		return regularClass;
	}

	public List<ClassApply> getClassApplyList() {
		List<ClassApply> classApplyList = classMapper.getClassApplyList();
		return classApplyList;
	}
	
	/* 2021.10.31 김경수 추가 */

	public List<RegularClass> searchRegularClass(String className) {
		
		String policyCode = classMapper.getClassPolicyCode(className);
		List<RegularClass> regularClass = classMapper.searchRegularClass(policyCode);
		return regularClass;
	}
	public void applyClass(String regularClassCode, String classStartDate, String classStartTime, String introduction) {
		
		
		classMapper.applyClass(regularClassCode,classStartDate,classStartTime,introduction);
	}
	/* 2021.10.31 김경수 추가 */

}
