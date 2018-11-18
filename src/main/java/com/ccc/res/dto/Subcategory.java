package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subcategory database table.
 * 
 */
@Entity
@NamedQuery(name="Subcategory.findAll", query="SELECT s FROM Subcategory s")
public class Subcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer subcategoryidpk;

	private Long categoryid;

	private Long departmentid;

	private Integer displayorder;

	private String languageid;

	private Long priorityid;

	private Boolean status;

	private Long subcategoryid;

	private String subcategoryname;

	public Subcategory() {
	}

	public Integer getSubcategoryidpk() {
		return this.subcategoryidpk;
	}

	public void setSubcategoryidpk(Integer subcategoryidpk) {
		this.subcategoryidpk = subcategoryidpk;
	}

	public Long getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public Long getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	public String getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(String languageid) {
		this.languageid = languageid;
	}

	public Long getPriorityid() {
		return this.priorityid;
	}

	public void setPriorityid(Long priorityid) {
		this.priorityid = priorityid;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getSubcategoryid() {
		return this.subcategoryid;
	}

	public void setSubcategoryid(Long subcategoryid) {
		this.subcategoryid = subcategoryid;
	}

	public String getSubcategoryname() {
		return this.subcategoryname;
	}

	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}

}