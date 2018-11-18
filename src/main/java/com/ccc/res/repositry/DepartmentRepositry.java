/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Department;

/**
 * @author Administrator
 *
 */
public interface DepartmentRepositry extends PagingAndSortingRepository<Department	,Integer> {

}
