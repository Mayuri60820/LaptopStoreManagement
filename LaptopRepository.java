package com.edu.LaptopStore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edu.LaptopStore.Entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {

	List<Laptop> findLaptopByLaptopName(String laptopName);

	List<Laptop> findByProcessor(String processor);
	
	//@Query("Select l From LaptopTbl l ORDER BY l.laptopName DESC")
	//List<Laptop>findLaptopOrderBy();
	@Query("Select l from Laptop l ORDER BY l.laptopName DESC")
	List<Laptop>findLaptopOrderBy();
	/*@Query("Select l from Laptop l Where l.laptopPrice BETWEEN :Min And :Max ")
	List<Laptop> findLaptopInRange(@Param("Min""Max") String laptopPrice);*/
	
	//@Query("Select l from Laptop l  where l.processor=:name")
	//List<Laptop>findByProcessor(@Param("name") String processor);
	

}
