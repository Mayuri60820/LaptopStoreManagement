package com.edu.LaptopStore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PartTbl")
public class Parts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PartId")
	private long partId;
	@Column(name="PartName")
	private String partName;
	@Column(name="PartCompanyName")
	private String partCompanyName;
	@Column(name="PartPrice")
	private String partPrice;
	@Column(name="PartDescription")
	private String partDescription;
	public long getPartId() {
		return partId;
	}
	public void setPartId(long partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartCompanyName() {
		return partCompanyName;
	}
	public void setPartCompanyName(String partCompanyName) {
		this.partCompanyName = partCompanyName;
	}
	public String getPartPrice() {
		return partPrice;
	}
	public void setPartPrice(String partPrice) {
		this.partPrice = partPrice;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	
	

}
