/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Request;

/**
 * @author Administrator
 *
 */
public interface RequestRepositry extends PagingAndSortingRepository<Request,Long> {

}
