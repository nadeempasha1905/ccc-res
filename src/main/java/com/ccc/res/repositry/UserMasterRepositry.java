/**
 * 
 */
package com.ccc.res.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.UserMaster;

/**
 * @author Administrator
 *
 */
public interface UserMasterRepositry extends PagingAndSortingRepository<UserMaster, Integer> {

}
