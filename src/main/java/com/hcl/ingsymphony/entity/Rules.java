package com.hcl.ingsymphony.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rules {
	@Id
	private int ruleId;
	private int areaId;
	private int category;
	private String severity;
	public Rules() {
		super();
		
	}
	public Rules(int ruleId, int areaId, int category, String severity) {
		super();
		this.ruleId = ruleId;
		this.areaId = areaId;
		this.category = category;
		this.severity = severity;
	}
	public int getRuleId() {
		return ruleId;
	}
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	

}
