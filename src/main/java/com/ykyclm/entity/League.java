package com.ykyclm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "league")
public class League {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String name; //league name
	@Column(nullable = false)
	private Integer countryID; //team id for mapping which country of the league
	@Column(nullable = false)
	private Integer teamNums; //total num of teams within
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
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	public Integer getTeamNums() {
		return teamNums;
	}
	public void setTeamNums(Integer teamNums) {
		this.teamNums = teamNums;
	}

}
