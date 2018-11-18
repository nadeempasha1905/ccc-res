/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Category;
import com.ccc.res.dto.Designation;

/**
 * @author Administrator
 *
 */
public interface CategoryRepositry extends PagingAndSortingRepository<Category, Integer> {

}
