package com.hcl.ingsymphony.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.AllTickets;
@Repository
public interface AllTicketsRepository extends JpaRepository<AllTickets, Long> {

	

	AllTickets findByEmployeeId(Long employeeId);
@Query(value="select *  from   All_Tickets  where severity=?1",nativeQuery=true)
	List<AllTickets> findAllBySeverity(String severity);

}
