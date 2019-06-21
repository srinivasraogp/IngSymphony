package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.AllTickets;
@Repository
public interface AllTicketsRepository extends JpaRepository<AllTickets, Long> {

	

	AllTickets findByEmployeeId(Long employeeId);

}
