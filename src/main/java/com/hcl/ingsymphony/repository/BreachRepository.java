package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ingsymphony.entity.Breach;

@Repository
public interface BreachRepository extends JpaRepository<Breach, Integer>{

	@Query(value="select b from Breach b where b.breach_Id=?1 ",nativeQuery=true)
	Breach findById(int breachId);

}
