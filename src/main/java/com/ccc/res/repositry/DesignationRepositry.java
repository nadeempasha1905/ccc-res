/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ccc.res.dto.Designation;

/**
 * @author Administrator
 *
 */
public interface DesignationRepositry extends PagingAndSortingRepository<Designation, Long> {
	
	public final static String getDesignationMaxid=" select max(dsg_id)+1 as max_dsgid from designations ";	

	@Query(value=getDesignationMaxid,nativeQuery = true)
	public Long getDesignationMaxid();
	
	public List<Designation> findAllByOrderByDsgId();
	
	

}
