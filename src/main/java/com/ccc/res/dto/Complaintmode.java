package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the complaintmode database table.
 * 
 */
@Entity
@NamedQuery(name="Complaintmode.findAll", query="SELECT c FROM Complaintmode c")
public class Complaintmode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer modeidpk;

	private String languageid;

	private Long modeid;

	private String modename;

	public Complaintmode() {
	}

	public Integer getModeidpk() {
		return this.modeidpk;
	}

	public void setModeidpk(Integer modeidpk) {
		this.modeidpk = modeidpk;
	}

	public String getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(String languageid) {
		this.languageid = languageid;
	}

	public Long getModeid() {
		return this.modeid;
	}

	public void setModeid(Long modeid) {
		this.modeid = modeid;
	}

	public String getModename() {
		return this.modename;
	}

	public void setModename(String modename) {
		this.modename = modename;
	}

}