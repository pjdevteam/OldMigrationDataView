package com.accenture.oldmigrationdataview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "TRSD0070")
public class MigrationHistory {
	@Id
	@Column(name = "R_APPLY_NO", nullable = false)
	private Long applyNumber;
	
	//@Id
	@Column(name = "R_RSC_NO", nullable = false)
	private Long resourceNumber;

	@Column(name = "R_RSC_VER")
	private String migrationVersion;
	
	//@Id
	@Column(name = "R_RLS_ENV_CD", nullable = false)
	private String environmentCode;
	
	@Column(name = "R_APPLY_DT")
	private Long applyDate;
	
	@Column(name = "R_APPLY_PSN")
	private String applyPerson;
	
	@Column(name = "R_RECOG_PSN")
	private String recognizedPerson;
	
	@Column(name = "R_RLS_DT")
	private Long migrationDate;
	
	@Column(name = "R_RLS_TM")
	private String migrationTiming;
	
	@Column(name = "R_SIR_NO")
	private String sirNumber;
	
	public Long getApplyNumber() {
		return applyNumber;
	}

	public void setApplyNumber(Long applyNumber) {
		this.applyNumber = applyNumber;
	}

	public Long getResourceNumber() {
		return resourceNumber;
	}

	public void setResourceNumber(Long resourceNumber) {
		this.resourceNumber = resourceNumber;
	}

	public String getMigrationVersion() {
		return migrationVersion;
	}

	public void setMigrationVersion(String migrationVersion) {
		this.migrationVersion = migrationVersion;
	}

	public String getEnvironmentCode() {
		return environmentCode;
	}

	public void setEnvironmentCode(String environmentCode) {
		this.environmentCode = environmentCode;
	}

	public Long getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Long applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyPerson() {
		return applyPerson;
	}

	public void setApplyPerson(String applyPerson) {
		this.applyPerson = applyPerson;
	}

	public String getRecognizedPerson() {
		return recognizedPerson;
	}

	public void setRecognizedPerson(String recognizedPerson) {
		this.recognizedPerson = recognizedPerson;
	}

	public Long getMigrationDate() {
		return migrationDate;
	}

	public void setMigrationDate(Long migrationDate) {
		this.migrationDate = migrationDate;
	}

	public String getMigrationTiming() {
		return migrationTiming;
	}

	public void setMigrationTiming(String migrationTiming) {
		this.migrationTiming = migrationTiming;
	}

	public String getSirNumber() {
		return sirNumber;
	}

	public void setSirNumber(String sirNumber) {
		this.sirNumber = sirNumber;
	}
}
