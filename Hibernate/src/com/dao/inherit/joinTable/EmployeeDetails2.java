package com.dao.inherit.joinTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name = "EmployeeDetails2")
@PrimaryKeyJoinColumn(name="ID")
public class EmployeeDetails2 extends Person2{
 
	@Column(name = "projId")
	private String projId;
	
	@Column(name = "deptId")
	private String deptId;

	public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
	
	
}
