package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.ClassPolicy;

@Mapper
public interface ClassMapper {
	public int addClassPolicy(ClassPolicy classPolicy);
	
	public ClassPolicy classPolicyNameCheck(ClassPolicy classPolicy);
	
	public List<ClassPolicy> searchPolicyList(String classPeriod, String classDay, String classTime, String className);
	
	public List<ClassPolicy> getClassPolicy();
}