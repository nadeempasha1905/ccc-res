package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ccc.res.dto.Cadre;
import com.ccc.res.dto.StationMaster;

public interface StationMasterRepositry extends PagingAndSortingRepository<StationMaster, Integer>{
	
	public List<StationMaster> findAllByOrderBySmStationId();

}
