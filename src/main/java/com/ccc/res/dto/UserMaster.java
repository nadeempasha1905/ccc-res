package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_master database table.
 * 
 */
@Entity
@Table(name="user_master")
@NamedQuery(name="UserMaster.findAll", query="SELECT u FROM UserMaster u")
public class UserMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="um_id")
	@SequenceGenerator(name="usermaster_ID_GENERATOR", sequenceName="user_master_um_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usermaster_ID_GENERATOR")
	private Integer umId;

	@Column(name="um_createdby")
	private String umCreatedby;

	@Column(name="um_createdon")
	private Timestamp umCreatedon;

	@Column(name="um_department_id")
	private Long umDepartmentId;

	@Column(name="um_email")
	private String umEmail;

	@Column(name="um_location_code")
	private String umLocationCode;

	@Column(name="um_name")
	private String umName;

	@Column(name="um_password")
	private String umPassword;

	@Column(name="um_phone")
	private String umPhone;

	@Column(name="um_role")
	private String umRole;

	@Column(name="um_status")
	private Boolean umStatus;

	@Column(name="um_user_id")
	private String umUserId;

	@Column(name="um_valid_from")
	private Timestamp umValidFrom;

	@Column(name="um_valid_to")
	private Timestamp umValidTo;

	public UserMaster() {
	}

	public Integer getUmId() {
		return this.umId;
	}

	public void setUmId(Integer umId) {
		this.umId = umId;
	}

	public String getUmCreatedby() {
		return this.umCreatedby;
	}

	public void setUmCreatedby(String umCreatedby) {
		this.umCreatedby = umCreatedby;
	}

	public Timestamp getUmCreatedon() {
		return this.umCreatedon;
	}

	public void setUmCreatedon(Timestamp umCreatedon) {
		this.umCreatedon = umCreatedon;
	}

	public Long getUmDepartmentId() {
		return this.umDepartmentId;
	}

	public void setUmDepartmentId(Long umDepartmentId) {
		this.umDepartmentId = umDepartmentId;
	}

	public String getUmEmail() {
		return this.umEmail;
	}

	public void setUmEmail(String umEmail) {
		this.umEmail = umEmail;
	}

	public String getUmLocationCode() {
		return this.umLocationCode;
	}

	public void setUmLocationCode(String umLocationCode) {
		this.umLocationCode = umLocationCode;
	}

	public String getUmName() {
		return this.umName;
	}

	public void setUmName(String umName) {
		this.umName = umName;
	}

	public String getUmPassword() {
		return this.umPassword;
	}

	public void setUmPassword(String umPassword) {
		this.umPassword = umPassword;
	}

	public String getUmPhone() {
		return this.umPhone;
	}

	public void setUmPhone(String umPhone) {
		this.umPhone = umPhone;
	}

	public String getUmRole() {
		return this.umRole;
	}

	public void setUmRole(String umRole) {
		this.umRole = umRole;
	}

	public Boolean getUmStatus() {
		return this.umStatus;
	}

	public void setUmStatus(Boolean umStatus) {
		this.umStatus = umStatus;
	}

	public String getUmUserId() {
		return this.umUserId;
	}

	public void setUmUserId(String umUserId) {
		this.umUserId = umUserId;
	}

	public Timestamp getUmValidFrom() {
		return this.umValidFrom;
	}

	public void setUmValidFrom(Timestamp umValidFrom) {
		this.umValidFrom = umValidFrom;
	}

	public Timestamp getUmValidTo() {
		return this.umValidTo;
	}

	public void setUmValidTo(Timestamp umValidTo) {
		this.umValidTo = umValidTo;
	}

}