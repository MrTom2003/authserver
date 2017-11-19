package com.example.controller.model;

public class MedicationPlan {
    private long id;
    private String payload;
    
    
    
	public MedicationPlan(long id, String payload) {
		super();
		this.id = id;
		this.payload = payload;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
}