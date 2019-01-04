/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Cadre;
import com.ccc.res.dto.Designation;

/**
 * @author Administrator
 *
 */
public interface CadreRepositry extends PagingAndSortingRepository<Cadre, Integer> {
	
	public final static String getCadreSMaxid=" select max(cdr_id)+1 as max_cadreid from cadre ";	

	@Query(value=getCadreSMaxid,nativeQuery = true)
	public Long getCadreSMaxid();
	
	public List<Cadre> findAllByOrderByCdrId();

}
