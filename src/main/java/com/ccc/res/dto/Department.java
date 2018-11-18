package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long departmentidpk;

	private Long departmentid;

	private String departmentname;

	private String languageid;

	private Long organizationid;

	public Department() {
	}

	public Long getDepartmentidpk() {
		return this.departmentidpk;
	}

	public void setDepartmentidpk(Long departmentidpk) {
		this.departmentidpk = departmentidpk;
	}

	public Long getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(String languageid) {
		this.languageid = languageid;
	}

	public Long getOrganizationid() {
		return this.organizationid;
	}

	public void setOrganizationid(Long organizationid) {
		this.organizationid = organizationid;
	}

}