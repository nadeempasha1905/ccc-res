package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.FeederMaster;

public interface FeederMasterRepositry extends PagingAndSortingRepository<FeederMaster, Integer>{
	
	public List<FeederMaster> findAllByOrderByFmFeederId();

}
