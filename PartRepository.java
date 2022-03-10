package com.edu.LaptopStore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edu.LaptopStore.Entity.Parts;


public interface PartRepository extends JpaRepository<Parts,Long> {
	@Query("Select p from Parts p ORDER BY p.partId DESC")
	List<Parts> FindByOrder();

}
