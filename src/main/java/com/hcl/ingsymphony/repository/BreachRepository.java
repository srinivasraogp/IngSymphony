package com.hcl.ingsymphony.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.Breach;

@Repository
public interface BreachRepository extends JpaRepository<Breach, Integer>{

	@Query(value="select * from Breach  where breach_Id=?1 and user_Id=?2 ",nativeQuery=true)
	Breach findByBreachIdAndUserId(int breachId, int userId);

	List<Breach> findBySeverity(String roleName);

}
