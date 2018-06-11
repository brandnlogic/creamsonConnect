package com.bnl.application.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class GuardianDetailsDTO {
	
	@EmbeddedId
	private GuardianPrimaryKey guardianPrimaryKey;
	
	@Column(name = "GUARDIAN_TYPE")
	private String guardianType;
	
	@Column(name = "RELATIONSHIP")
	private String relationship;
	
	@Column(name = "LAST_UPDATE_ID")
	private String lastUpdateId;
	
	@Column(name = "LAST_UPDATE_TIMESTAMP")
	private String lastUpdateTimestamp;
	
	public GuardianPrimaryKey getGuardianPrimaryKey() {
		return guardianPrimaryKey;
	}
	public void setGuardianPrimaryKey(GuardianPrimaryKey guardianPrimaryKey) {
		this.guardianPrimaryKey = guardianPrimaryKey;
	}
	public String getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getLastUpdateId() {
		return lastUpdateId;
	}
	public void setLastUpdateId(String lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}
	public String getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}
	public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}
}
