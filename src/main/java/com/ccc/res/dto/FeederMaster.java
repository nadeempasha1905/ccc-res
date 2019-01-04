package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the feeder_master database table.
 * 
 */
@Entity
@Table(name="feeder_master")
@NamedQuery(name="FeederMaster.findAll", query="SELECT f FROM FeederMaster f")
public class FeederMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fm_feeder_id")
	@SequenceGenerator(name="feeder_ID_GENERATOR", sequenceName="feeder_master_fm_feeder_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="feeder_ID_GENERATOR")
	private Integer fmFeederId;

	@Column(name="fm_created_by")
	private String fmCreatedBy;

	@Column(name="fm_created_on")
	private Timestamp fmCreatedOn;

	@Column(name="fm_feeder_code")
	private String fmFeederCode;

	@Column(name="fm_feeder_name")
	private String fmFeederName;

	@Column(name="fm_feeder_satus")
	private Boolean fmFeederSatus;

	@Column(name="fm_location_code")
	private String fmLocationCode;

	@Column(name="fm_location_name")
	private String fmLocationName;

	@Column(name="fm_station_id")
	private String fmStationId;

	@Column(name="fm_station_name")
	private String fmStationName;

	@Column(name="fm_updated_by")
	private String fmUpdatedBy;

	@Column(name="fm_updated_on")
	private Timestamp fmUpdatedOn;

	public FeederMaster() {
	}

	public Integer getFmFeederId() {
		return this.fmFeederId;
	}

	public void setFmFeederId(Integer fmFeederId) {
		this.fmFeederId = fmFeederId;
	}

	public String getFmCreatedBy() {
		return this.fmCreatedBy;
	}

	public void setFmCreatedBy(String fmCreatedBy) {
		this.fmCreatedBy = fmCreatedBy;
	}

	public Timestamp getFmCreatedOn() {
		return this.fmCreatedOn;
	}

	public void setFmCreatedOn(Timestamp fmCreatedOn) {
		this.fmCreatedOn = fmCreatedOn;
	}

	public String getFmFeederCode() {
		return this.fmFeederCode;
	}

	public void setFmFeederCode(String fmFeederCode) {
		this.fmFeederCode = fmFeederCode;
	}

	public String getFmFeederName() {
		return this.fmFeederName;
	}

	public void setFmFeederName(String fmFeederName) {
		this.fmFeederName = fmFeederName;
	}

	public Boolean getFmFeederSatus() {
		return this.fmFeederSatus;
	}

	public void setFmFeederSatus(Boolean fmFeederSatus) {
		this.fmFeederSatus = fmFeederSatus;
	}

	public String getFmLocationCode() {
		return this.fmLocationCode;
	}

	public void setFmLocationCode(String fmLocationCode) {
		this.fmLocationCode = fmLocationCode;
	}

	public String getFmLocationName() {
		return this.fmLocationName;
	}

	public void setFmLocationName(String fmLocationName) {
		this.fmLocationName = fmLocationName;
	}

	public String getFmStationId() {
		return this.fmStationId;
	}

	public void setFmStationId(String fmStationId) {
		this.fmStationId = fmStationId;
	}

	public String getFmStationName() {
		return this.fmStationName;
	}

	public void setFmStationName(String fmStationName) {
		this.fmStationName = fmStationName;
	}

	public String getFmUpdatedBy() {
		return this.fmUpdatedBy;
	}

	public void setFmUpdatedBy(String fmUpdatedBy) {
		this.fmUpdatedBy = fmUpdatedBy;
	}

	public Timestamp getFmUpdatedOn() {
		return this.fmUpdatedOn;
	}

	public void setFmUpdatedOn(Timestamp fmUpdatedOn) {
		this.fmUpdatedOn = fmUpdatedOn;
	}

}