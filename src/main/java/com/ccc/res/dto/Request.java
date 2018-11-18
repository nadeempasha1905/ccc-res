package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the requests database table.
 * 
 */
@Entity
@Table(name="requests")
@NamedQuery(name="Request.findAll", query="SELECT r FROM Request r")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer requestpkid;

	@Column(name="account_id")
	private String accountId;

	@Column(name="category_id")
	private Long categoryId;

	private Timestamp closedate;

	@Column(name="consumer_address")
	private String consumerAddress;

	@Column(name="consumer_email_id")
	private String consumerEmailId;

	@Column(name="consumer_mobile_number")
	private String consumerMobileNumber;

	@Column(name="consumer_name")
	private String consumerName;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String description;

	private String docketno;

	private double lattitude;

	@Column(name="location_code")
	private String locationCode;

	@Column(name="location_name")
	private String locationName;

	private double longitude;

	@Column(name="mode_id")
	private Long modeId;

	@Column(name="officer_id")
	private Long officerId;

	@Column(name="officer_name")
	private String officerName;

	private Timestamp opendate;

	private Long organizationid;

	@Column(name="priority_id")
	private Long priorityId;

	private String relpath;

	private Long reopencount;

	@Column(name="rr_number")
	private String rrNumber;

	@Column(name="status_id")
	private Long statusId;

	@Column(name="subcategory_id")
	private Long subcategoryId;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_on")
	private Timestamp updatedOn;

	private Boolean uploadflag;

	public Request() {
	}

	public Integer getRequestpkid() {
		return this.requestpkid;
	}

	public void setRequestpkid(Integer requestpkid) {
		this.requestpkid = requestpkid;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Timestamp getClosedate() {
		return this.closedate;
	}

	public void setClosedate(Timestamp closedate) {
		this.closedate = closedate;
	}

	public String getConsumerAddress() {
		return this.consumerAddress;
	}

	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public String getConsumerEmailId() {
		return this.consumerEmailId;
	}

	public void setConsumerEmailId(String consumerEmailId) {
		this.consumerEmailId = consumerEmailId;
	}

	public String getConsumerMobileNumber() {
		return this.consumerMobileNumber;
	}

	public void setConsumerMobileNumber(String consumerMobileNumber) {
		this.consumerMobileNumber = consumerMobileNumber;
	}

	public String getConsumerName() {
		return this.consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocketno() {
		return this.docketno;
	}

	public void setDocketno(String docketno) {
		this.docketno = docketno;
	}

	public double getLattitude() {
		return this.lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Long getModeId() {
		return this.modeId;
	}

	public void setModeId(Long modeId) {
		this.modeId = modeId;
	}

	public Long getOfficerId() {
		return this.officerId;
	}

	public void setOfficerId(Long officerId) {
		this.officerId = officerId;
	}

	public String getOfficerName() {
		return this.officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public Timestamp getOpendate() {
		return this.opendate;
	}

	public void setOpendate(Timestamp opendate) {
		this.opendate = opendate;
	}

	public Long getOrganizationid() {
		return this.organizationid;
	}

	public void setOrganizationid(Long organizationid) {
		this.organizationid = organizationid;
	}

	public Long getPriorityId() {
		return this.priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public String getRelpath() {
		return this.relpath;
	}

	public void setRelpath(String relpath) {
		this.relpath = relpath;
	}

	public Long getReopencount() {
		return this.reopencount;
	}

	public void setReopencount(Long reopencount) {
		this.reopencount = reopencount;
	}

	public String getRrNumber() {
		return this.rrNumber;
	}

	public void setRrNumber(String rrNumber) {
		this.rrNumber = rrNumber;
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public Long getSubcategoryId() {
		return this.subcategoryId;
	}

	public void setSubcategoryId(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Boolean getUploadflag() {
		return this.uploadflag;
	}

	public void setUploadflag(Boolean uploadflag) {
		this.uploadflag = uploadflag;
	}

}