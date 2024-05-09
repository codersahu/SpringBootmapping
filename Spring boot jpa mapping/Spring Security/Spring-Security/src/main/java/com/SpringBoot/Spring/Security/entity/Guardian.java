package com.SpringBoot.Spring.Security.entity;

import jakarta.persistence.Embeddable;

@Embeddable   // we are using embeddable cause we dont want to create another table for guardian, but we want like this table will be merged with our students table so for that we are using embeddable
public class Guardian {
	
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	@Override
	public String toString() {
		return "Guardian [guardianName=" + guardianName + ", guardianEmail=" + guardianEmail + ", guardianMobile="
				+ guardianMobile + "]";
	}
	public Guardian(String guardianName, String guardianEmail, String guardianMobile) {
		super();
		this.guardianName = guardianName;
		this.guardianEmail = guardianEmail;
		this.guardianMobile = guardianMobile;
	}
	public Guardian() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
