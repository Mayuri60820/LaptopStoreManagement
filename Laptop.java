package com.edu.LaptopStore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity()
@Table(name="LaptopTbl")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LaptopID")
	private long laptopId;
	@Column(name="LaptopName")
	private String laptopName;
	@Column(name="LaptopCompanyName")
	private String laptopCompanyName;
	@Column(name="LaptopPrice")
	private String laptopPrice;
	@Column(name="Processor")
	private String processor;
	@Column(name="LaptopDescription")
	private String laptopDescription;
	public long getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopCompanyName() {
		return laptopCompanyName;
	}
	public void setLaptopCompanyName(String laptopCompanyName) {
		this.laptopCompanyName = laptopCompanyName;
	}
	public String getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(String laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getLaptopDescription() {
		return laptopDescription;
	}
	public void setLaptopDescription(String laptopDescription) {
		this.laptopDescription = laptopDescription;
	}
	
	

}
