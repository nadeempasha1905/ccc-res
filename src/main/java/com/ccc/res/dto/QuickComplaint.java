package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the quick_complaints database table.
 * 
 */
@Entity
@Table(name="quick_complaints")
@NamedQuery(name="QuickComplaint.findAll", query="SELECT q FROM QuickComplaint q")
public class QuickComplaint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="qc_pkid")
	private Integer qcPkid;

	@Column(name="qc_account_id")
	private String qcAccountId;

	@Column(name="qc_assigned_date")
	private Timestamp qcAssignedDate;

	@Column(name="qc_assigned_status")
	private Boolean qcAssignedStatus;

	@Column(name="qc_assigned_to")
	private Long qcAssignedTo;

	@Column(name="qc_complaint_category")
	private Long qcComplaintCategory;

	@Column(name="qc_complaint_description")
	private String qcComplaintDescription;

	@Column(name="qc_complaint_subcategory")
	private Long qcComplaintSubcategory;

	@Column(name="qc_email_id")
	private String qcEmailId;

	@Column(name="qc_mobile_number")
	private String qcMobileNumber;

	@Column(name="qc_requested_date")
	private Timestamp qcRequestedDate;

	public QuickComplaint() {
	}

	public Integer getQcPkid() {
		return this.qcPkid;
	}

	public void setQcPkid(Integer qcPkid) {
		this.qcPkid = qcPkid;
	}

	public String getQcAccountId() {
		return this.qcAccountId;
	}

	public void setQcAccountId(String qcAccountId) {
		this.qcAccountId = qcAccountId;
	}

	public Timestamp getQcAssignedDate() {
		return this.qcAssignedDate;
	}

	public void setQcAssignedDate(Timestamp qcAssignedDate) {
		this.qcAssignedDate = qcAssignedDate;
	}

	public Boolean getQcAssignedStatus() {
		return this.qcAssignedStatus;
	}

	public void setQcAssignedStatus(Boolean qcAssignedStatus) {
		this.qcAssignedStatus = qcAssignedStatus;
	}

	public Long getQcAssignedTo() {
		return this.qcAssignedTo;
	}

	public void setQcAssignedTo(Long qcAssignedTo) {
		this.qcAssignedTo = qcAssignedTo;
	}

	public Long getQcComplaintCategory() {
		return this.qcComplaintCategory;
	}

	public void setQcComplaintCategory(Long qcComplaintCategory) {
		this.qcComplaintCategory = qcComplaintCategory;
	}

	public String getQcComplaintDescription() {
		return this.qcComplaintDescription;
	}

	public void setQcComplaintDescription(String qcComplaintDescription) {
		this.qcComplaintDescription = qcComplaintDescription;
	}

	public Long getQcComplaintSubcategory() {
		return this.qcComplaintSubcategory;
	}

	public void setQcComplaintSubcategory(Long qcComplaintSubcategory) {
		this.qcComplaintSubcategory = qcComplaintSubcategory;
	}

	public String getQcEmailId() {
		return this.qcEmailId;
	}

	public void setQcEmailId(String qcEmailId) {
		this.qcEmailId = qcEmailId;
	}

	public String getQcMobileNumber() {
		return this.qcMobileNumber;
	}

	public void setQcMobileNumber(String qcMobileNumber) {
		this.qcMobileNumber = qcMobileNumber;
	}

	public Timestamp getQcRequestedDate() {
		return this.qcRequestedDate;
	}

	public void setQcRequestedDate(Timestamp qcRequestedDate) {
		this.qcRequestedDate = qcRequestedDate;
	}

}