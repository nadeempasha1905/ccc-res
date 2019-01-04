/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Cadre;
import com.ccc.res.dto.Category;
import com.ccc.res.dto.Designation;

/**
 * @author Administrator
 *
 */
public interface CategoryRepositry extends PagingAndSortingRepository<Category, Long> {

	public List<Category> findAllByOrderByCategoryid();
}
