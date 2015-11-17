package com.accenture.oldmigrationdataview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "TRSD0090")
public class SystemVersionMaster {
	@Id
	@Column(name = "R_SYS_VER_CD")
	private Long systemVersionCode;
	
	@Column(name = "R_SYS_VER_NM", nullable = false)
	private String systemVersionName;

	public Long getSystemVersionCode() {
		return systemVersionCode;
	}

	public void setSystemVersionCode(Long systemVersionCode) {
		this.systemVersionCode = systemVersionCode;
	}

	public String getSystemVersionName() {
		return systemVersionName;
	}

	public void setSystemVersionName(String systemVersionName) {
		this.systemVersionName = systemVersionName;
	}

}
