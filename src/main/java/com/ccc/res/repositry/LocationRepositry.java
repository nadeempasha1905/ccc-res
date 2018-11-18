/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Designation;
import com.ccc.res.dto.LocationDetail;

/**
 * @author Administrator
 *
 */
public interface LocationRepositry extends PagingAndSortingRepository<LocationDetail, Integer>{

}
