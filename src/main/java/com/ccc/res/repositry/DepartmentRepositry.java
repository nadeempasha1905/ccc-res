/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Category;
import com.ccc.res.dto.Department;

/**
 * @author Administrator
 *
 */
public interface DepartmentRepositry extends PagingAndSortingRepository<Department	,Long> {
	
	public final static String getDepartmentMaxid=" select max(departmentid)+1 as max_departmentid from department ";	

	@Query(value=getDepartmentMaxid,nativeQuery = true)
	public Long getDepartmentMaxid();

	public List<Department> findAllByOrderByDepartmentid();
}
