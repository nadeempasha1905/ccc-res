package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer categoryidpk;

	private Long categoryid;

	private String categoryname;

	private String languageid;

	public Category() {
	}

	public Integer getCategoryidpk() {
		return this.categoryidpk;
	}

	public void setCategoryidpk(Integer categoryidpk) {
		this.categoryidpk = categoryidpk;
	}

	public Long getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(String languageid) {
		this.languageid = languageid;
	}

}