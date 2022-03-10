package com.edu.LaptopStore.Exception;

public class ResourceNotFound extends RuntimeException{
	private static final long serialVersionUID=1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	public ResourceNotFound(String resourceName, String fieldName, Object fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}

}
