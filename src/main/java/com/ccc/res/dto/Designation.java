package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the designations database table.
 * 
 */
@Entity
@Table(name="designations")
@NamedQuery(name="Designation.findAll", query="SELECT d FROM Designation d")
public class Designation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dsg_pkid")
	@SequenceGenerator(name="designation_ID_GENERATOR", sequenceName="designations_dsg_pkid_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="designation_ID_GENERATOR")
	private Integer dsgPkid;

	@Column(name="dsg_cadre_id")
	private Long dsgCadreId;

	@Column(name="dsg_cadre_name")
	private String dsgCadreName;

	@Column(name="dsg_created_by")
	private String dsgCreatedBy;

	@Column(name="dsg_created_on")
	private Timestamp dsgCreatedOn;

	@Column(name="dsg_delete_status")
	private Boolean dsgDeleteStatus;

	@Column(name="dsg_deleted_date")
	private Timestamp dsgDeletedDate;

	@Column(name="dsg_department_id")
	private Long dsgDepartmentId;

	@Column(name="dsg_department_name")
	private String dsgDepartmentName;

	@Column(name="dsg_id")
	private Long dsgId;

	@Column(name="dsg_name")
	private String dsgName;

	@Column(name="dsg_updated_by")
	private String dsgUpdatedBy;

	@Column(name="dsg_updated_on")
	private Timestamp dsgUpdatedOn;

	public Designation() {
	}

	public Integer getDsgPkid() {
		return this.dsgPkid;
	}

	public void setDsgPkid(Integer dsgPkid) {
		this.dsgPkid = dsgPkid;
	}

	public Long getDsgCadreId() {
		return this.dsgCadreId;
	}

	public void setDsgCadreId(Long dsgCadreId) {
		this.dsgCadreId = dsgCadreId;
	}

	public String getDsgCadreName() {
		return this.dsgCadreName;
	}

	public void setDsgCadreName(String dsgCadreName) {
		this.dsgCadreName = dsgCadreName;
	}

	public String getDsgCreatedBy() {
		return this.dsgCreatedBy;
	}

	public void setDsgCreatedBy(String dsgCreatedBy) {
		this.dsgCreatedBy = dsgCreatedBy;
	}

	public Timestamp getDsgCreatedOn() {
		return this.dsgCreatedOn;
	}

	public void setDsgCreatedOn(Timestamp dsgCreatedOn) {
		this.dsgCreatedOn = dsgCreatedOn;
	}

	public Boolean getDsgDeleteStatus() {
		return this.dsgDeleteStatus;
	}

	public void setDsgDeleteStatus(Boolean dsgDeleteStatus) {
		this.dsgDeleteStatus = dsgDeleteStatus;
	}

	public Timestamp getDsgDeletedDate() {
		return this.dsgDeletedDate;
	}

	public void setDsgDeletedDate(Timestamp dsgDeletedDate) {
		this.dsgDeletedDate = dsgDeletedDate;
	}

	public Long getDsgDepartmentId() {
		return this.dsgDepartmentId;
	}

	public void setDsgDepartmentId(Long dsgDepartmentId) {
		this.dsgDepartmentId = dsgDepartmentId;
	}

	public String getDsgDepartmentName() {
		return this.dsgDepartmentName;
	}

	public void setDsgDepartmentName(String dsgDepartmentName) {
		this.dsgDepartmentName = dsgDepartmentName;
	}

	public Long getDsgId() {
		return this.dsgId;
	}

	public void setDsgId(Long dsgId) {
		this.dsgId = dsgId;
	}

	public String getDsgName() {
		return this.dsgName;
	}

	public void setDsgName(String dsgName) {
		this.dsgName = dsgName;
	}

	public String getDsgUpdatedBy() {
		return this.dsgUpdatedBy;
	}

	public void setDsgUpdatedBy(String dsgUpdatedBy) {
		this.dsgUpdatedBy = dsgUpdatedBy;
	}

	public Timestamp getDsgUpdatedOn() {
		return this.dsgUpdatedOn;
	}

	public void setDsgUpdatedOn(Timestamp dsgUpdatedOn) {
		this.dsgUpdatedOn = dsgUpdatedOn;
	}

}