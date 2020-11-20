package com.reulate.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.reulate.model.EmployeeDetails;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<EmployeeDetails, Integer> {

	List<EmployeeDetails> findByPlace(String place);
	
	List<EmployeeDetails> findAllByPlace(String place, Pageable pageabe);
	

}
