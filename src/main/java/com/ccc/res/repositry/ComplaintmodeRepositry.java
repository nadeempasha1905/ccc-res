/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Category;
import com.ccc.res.dto.Complaintmode;
import com.ccc.res.dto.Designation;

/**
 * @author Administrator
 *
 */
public interface ComplaintmodeRepositry extends PagingAndSortingRepository<Complaintmode, Long> {

	public List<Complaintmode> findAllByOrderByModeid();
}
