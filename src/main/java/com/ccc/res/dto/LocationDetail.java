package com.ccc.res.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the location_details database table.
 * 
 */
@Entity
@Table(name="location_details")
@NamedQuery(name="LocationDetail.findAll", query="SELECT l FROM LocationDetail l")
public class LocationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ld_id")
	private Integer ldId;

	@Column(name="ld_accting_code")
	private String ldAcctingCode;

	@Column(name="ld_acctng_flag")
	private String ldAcctngFlag;

	@Column(name="ld_addr1")
	private String ldAddr1;

	@Column(name="ld_addr2")
	private String ldAddr2;

	@Column(name="ld_addr3")
	private String ldAddr3;

	@Column(name="ld_addr4")
	private String ldAddr4;

	@Column(name="ld_auth_officer")
	private String ldAuthOfficer;

	@Column(name="ld_circle_code")
	private String ldCircleCode;

	@Column(name="ld_city_typ")
	private String ldCityTyp;

	@Column(name="ld_code")
	private String ldCode;

	@Column(name="ld_company_code")
	private String ldCompanyCode;

	@Column(name="ld_compilation_code")
	private String ldCompilationCode;

	@Column(name="ld_created_by")
	private String ldCreatedBy;

	@Column(name="ld_created_on")
	private Timestamp ldCreatedOn;

	@Column(name="ld_division_code")
	private String ldDivisionCode;

	@Column(name="ld_loc_shortcode")
	private String ldLocShortcode;

	@Column(name="ld_name")
	private String ldName;

	@Column(name="ld_nature_of_loc")
	private String ldNatureOfLoc;

	@Column(name="ld_office_typ")
	private String ldOfficeTyp;

	@Column(name="ld_org_code")
	private String ldOrgCode;

	@Column(name="ld_perent_office_code")
	private String ldPerentOfficeCode;

	@Column(name="ld_pin")
	private String ldPin;

	@Column(name="ld_rapdrp_location_code")
	private String ldRapdrpLocationCode;

	@Column(name="ld_rapdrp_town_name")
	private String ldRapdrpTownName;

	@Column(name="ld_town_city")
	private String ldTownCity;

	@Column(name="ld_type")
	private String ldType;

	@Column(name="ld_zone_code")
	private String ldZoneCode;

	public LocationDetail() {
	}

	public Integer getLdId() {
		return this.ldId;
	}

	public void setLdId(Integer ldId) {
		this.ldId = ldId;
	}

	public String getLdAcctingCode() {
		return this.ldAcctingCode;
	}

	public void setLdAcctingCode(String ldAcctingCode) {
		this.ldAcctingCode = ldAcctingCode;
	}

	public String getLdAcctngFlag() {
		return this.ldAcctngFlag;
	}

	public void setLdAcctngFlag(String ldAcctngFlag) {
		this.ldAcctngFlag = ldAcctngFlag;
	}

	public String getLdAddr1() {
		return this.ldAddr1;
	}

	public void setLdAddr1(String ldAddr1) {
		this.ldAddr1 = ldAddr1;
	}

	public String getLdAddr2() {
		return this.ldAddr2;
	}

	public void setLdAddr2(String ldAddr2) {
		this.ldAddr2 = ldAddr2;
	}

	public String getLdAddr3() {
		return this.ldAddr3;
	}

	public void setLdAddr3(String ldAddr3) {
		this.ldAddr3 = ldAddr3;
	}

	public String getLdAddr4() {
		return this.ldAddr4;
	}

	public void setLdAddr4(String ldAddr4) {
		this.ldAddr4 = ldAddr4;
	}

	public String getLdAuthOfficer() {
		return this.ldAuthOfficer;
	}

	public void setLdAuthOfficer(String ldAuthOfficer) {
		this.ldAuthOfficer = ldAuthOfficer;
	}

	public String getLdCircleCode() {
		return this.ldCircleCode;
	}

	public void setLdCircleCode(String ldCircleCode) {
		this.ldCircleCode = ldCircleCode;
	}

	public String getLdCityTyp() {
		return this.ldCityTyp;
	}

	public void setLdCityTyp(String ldCityTyp) {
		this.ldCityTyp = ldCityTyp;
	}

	public String getLdCode() {
		return this.ldCode;
	}

	public void setLdCode(String ldCode) {
		this.ldCode = ldCode;
	}

	public String getLdCompanyCode() {
		return this.ldCompanyCode;
	}

	public void setLdCompanyCode(String ldCompanyCode) {
		this.ldCompanyCode = ldCompanyCode;
	}

	public String getLdCompilationCode() {
		return this.ldCompilationCode;
	}

	public void setLdCompilationCode(String ldCompilationCode) {
		this.ldCompilationCode = ldCompilationCode;
	}

	public String getLdCreatedBy() {
		return this.ldCreatedBy;
	}

	public void setLdCreatedBy(String ldCreatedBy) {
		this.ldCreatedBy = ldCreatedBy;
	}

	public Timestamp getLdCreatedOn() {
		return this.ldCreatedOn;
	}

	public void setLdCreatedOn(Timestamp ldCreatedOn) {
		this.ldCreatedOn = ldCreatedOn;
	}

	public String getLdDivisionCode() {
		return this.ldDivisionCode;
	}

	public void setLdDivisionCode(String ldDivisionCode) {
		this.ldDivisionCode = ldDivisionCode;
	}

	public String getLdLocShortcode() {
		return this.ldLocShortcode;
	}

	public void setLdLocShortcode(String ldLocShortcode) {
		this.ldLocShortcode = ldLocShortcode;
	}

	public String getLdName() {
		return this.ldName;
	}

	public void setLdName(String ldName) {
		this.ldName = ldName;
	}

	public String getLdNatureOfLoc() {
		return this.ldNatureOfLoc;
	}

	public void setLdNatureOfLoc(String ldNatureOfLoc) {
		this.ldNatureOfLoc = ldNatureOfLoc;
	}

	public String getLdOfficeTyp() {
		return this.ldOfficeTyp;
	}

	public void setLdOfficeTyp(String ldOfficeTyp) {
		this.ldOfficeTyp = ldOfficeTyp;
	}

	public String getLdOrgCode() {
		return this.ldOrgCode;
	}

	public void setLdOrgCode(String ldOrgCode) {
		this.ldOrgCode = ldOrgCode;
	}

	public String getLdPerentOfficeCode() {
		return this.ldPerentOfficeCode;
	}

	public void setLdPerentOfficeCode(String ldPerentOfficeCode) {
		this.ldPerentOfficeCode = ldPerentOfficeCode;
	}

	public String getLdPin() {
		return this.ldPin;
	}

	public void setLdPin(String ldPin) {
		this.ldPin = ldPin;
	}

	public String getLdRapdrpLocationCode() {
		return this.ldRapdrpLocationCode;
	}

	public void setLdRapdrpLocationCode(String ldRapdrpLocationCode) {
		this.ldRapdrpLocationCode = ldRapdrpLocationCode;
	}

	public String getLdRapdrpTownName() {
		return this.ldRapdrpTownName;
	}

	public void setLdRapdrpTownName(String ldRapdrpTownName) {
		this.ldRapdrpTownName = ldRapdrpTownName;
	}

	public String getLdTownCity() {
		return this.ldTownCity;
	}

	public void setLdTownCity(String ldTownCity) {
		this.ldTownCity = ldTownCity;
	}

	public String getLdType() {
		return this.ldType;
	}

	public void setLdType(String ldType) {
		this.ldType = ldType;
	}

	public String getLdZoneCode() {
		return this.ldZoneCode;
	}

	public void setLdZoneCode(String ldZoneCode) {
		this.ldZoneCode = ldZoneCode;
	}

}