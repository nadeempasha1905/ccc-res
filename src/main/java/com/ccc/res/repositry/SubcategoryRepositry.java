/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Designation;
import com.ccc.res.dto.Subcategory;

/**
 * @author Administrator
 *
 */
public interface SubcategoryRepositry extends PagingAndSortingRepository<Subcategory, Long> {

}
