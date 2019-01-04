package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the station_master database table.
 * 
 */
@Entity
@Table(name="station_master")
@NamedQuery(name="StationMaster.findAll", query="SELECT s FROM StationMaster s")
public class StationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sm_station_id")
	@SequenceGenerator(name="station_ID_GENERATOR", sequenceName="station_master_sm_station_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="station_ID_GENERATOR")
	private Integer smStationId;

	@Column(name="sm_created_by")
	private String smCreatedBy;

	@Column(name="sm_created_on")
	private Timestamp smCreatedOn;

	@Column(name="sm_location_code")
	private String smLocationCode;

	@Column(name="sm_location_name")
	private String smLocationName;

	@Column(name="sm_station_name")
	private String smStationName;

	@Column(name="sm_station_status")
	private Boolean smStationStatus;

	@Column(name="sm_updated_by")
	private String smUpdatedBy;

	@Column(name="sm_updated_on")
	private Timestamp smUpdatedOn;

	public StationMaster() {
	}

	public Integer getSmStationId() {
		return this.smStationId;
	}

	public void setSmStationId(Integer smStationId) {
		this.smStationId = smStationId;
	}

	public String getSmCreatedBy() {
		return this.smCreatedBy;
	}

	public void setSmCreatedBy(String smCreatedBy) {
		this.smCreatedBy = smCreatedBy;
	}

	public Timestamp getSmCreatedOn() {
		return this.smCreatedOn;
	}

	public void setSmCreatedOn(Timestamp smCreatedOn) {
		this.smCreatedOn = smCreatedOn;
	}

	public String getSmLocationCode() {
		return this.smLocationCode;
	}

	public void setSmLocationCode(String smLocationCode) {
		this.smLocationCode = smLocationCode;
	}

	public String getSmLocationName() {
		return this.smLocationName;
	}

	public void setSmLocationName(String smLocationName) {
		this.smLocationName = smLocationName;
	}

	public String getSmStationName() {
		return this.smStationName;
	}

	public void setSmStationName(String smStationName) {
		this.smStationName = smStationName;
	}

	public Boolean getSmStationStatus() {
		return this.smStationStatus;
	}

	public void setSmStationStatus(Boolean smStationStatus) {
		this.smStationStatus = smStationStatus;
	}

	public String getSmUpdatedBy() {
		return this.smUpdatedBy;
	}

	public void setSmUpdatedBy(String smUpdatedBy) {
		this.smUpdatedBy = smUpdatedBy;
	}

	public Timestamp getSmUpdatedOn() {
		return this.smUpdatedOn;
	}

	public void setSmUpdatedOn(Timestamp smUpdatedOn) {
		this.smUpdatedOn = smUpdatedOn;
	}

}