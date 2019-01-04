package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cadre database table.
 * 
 */
@Entity
@Table(name="cadre")
@NamedQuery(name="Cadre.findAll", query="SELECT c FROM Cadre c")
public class Cadre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cdr_pkid")
	@SequenceGenerator(name="cadre_ID_GENERATOR", sequenceName="cadre_cdr_pkid_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cadre_ID_GENERATOR")
	private Integer cdrPkid;

	@Column(name="cdr_category")
	private String cdrCategory;

	@Column(name="cdr_created_by")
	private String cdrCreatedBy;

	@Column(name="cdr_created_on")
	private Timestamp cdrCreatedOn;

	@Column(name="cdr_delete_status")
	private Boolean cdrDeleteStatus;

	@Column(name="cdr_deleted_date")
	private Timestamp cdrDeletedDate;

	@Column(name="cdr_fde_code")
	private String cdrFdeCode;

	@Column(name="cdr_id")
	private Long cdrId;

	@Column(name="cdr_name")
	private String cdrName;

	@Column(name="cdr_updated_by")
	private String cdrUpdatedBy;

	@Column(name="cdr_updated_on")
	private Timestamp cdrUpdatedOn;

	public Cadre() {
	}

	public Integer getCdrPkid() {
		return this.cdrPkid;
	}

	public void setCdrPkid(Integer cdrPkid) {
		this.cdrPkid = cdrPkid;
	}

	public String getCdrCategory() {
		return this.cdrCategory;
	}

	public void setCdrCategory(String cdrCategory) {
		this.cdrCategory = cdrCategory;
	}

	public String getCdrCreatedBy() {
		return this.cdrCreatedBy;
	}

	public void setCdrCreatedBy(String cdrCreatedBy) {
		this.cdrCreatedBy = cdrCreatedBy;
	}

	public Timestamp getCdrCreatedOn() {
		return this.cdrCreatedOn;
	}

	public void setCdrCreatedOn(Timestamp cdrCreatedOn) {
		this.cdrCreatedOn = cdrCreatedOn;
	}

	public Boolean getCdrDeleteStatus() {
		return this.cdrDeleteStatus;
	}

	public void setCdrDeleteStatus(Boolean cdrDeleteStatus) {
		this.cdrDeleteStatus = cdrDeleteStatus;
	}

	public Timestamp getCdrDeletedDate() {
		return this.cdrDeletedDate;
	}

	public void setCdrDeletedDate(Timestamp cdrDeletedDate) {
		this.cdrDeletedDate = cdrDeletedDate;
	}

	public String getCdrFdeCode() {
		return this.cdrFdeCode;
	}

	public void setCdrFdeCode(String cdrFdeCode) {
		this.cdrFdeCode = cdrFdeCode;
	}

	public Long getCdrId() {
		return this.cdrId;
	}

	public void setCdrId(Long cdrId) {
		this.cdrId = cdrId;
	}

	public String getCdrName() {
		return this.cdrName;
	}

	public void setCdrName(String cdrName) {
		this.cdrName = cdrName;
	}

	public String getCdrUpdatedBy() {
		return this.cdrUpdatedBy;
	}

	public void setCdrUpdatedBy(String cdrUpdatedBy) {
		this.cdrUpdatedBy = cdrUpdatedBy;
	}

	public Timestamp getCdrUpdatedOn() {
		return this.cdrUpdatedOn;
	}

	public void setCdrUpdatedOn(Timestamp cdrUpdatedOn) {
		this.cdrUpdatedOn = cdrUpdatedOn;
	}

}