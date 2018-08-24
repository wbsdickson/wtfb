package com.ykyclm.entity.vo;

public class TeamVo {
	 
	private long id;
	private String name;
	private String code;
	private String type; 
	private CountryVo country;
	 
	//private League league;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CountryVo getCountry() {
		return country;
	}

	public void setCountry(CountryVo country) {
		this.country = country;
	}

 
//
//	public League getLeague() {
//		return league;
//	}
//
//	public void setLeague(League league) {
//		this.league = league;
//	}
//	
	

}
