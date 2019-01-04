/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.LocationDetail;
import com.ccc.res.dto.QuickComplaint;

/**
 * @author Administrator
 *
 */
public interface QuickComplaintRepositry extends PagingAndSortingRepository<QuickComplaint,Long>{

	public List<QuickComplaint> findAllByOrderByQcPkid();
}
