package com.ykyclm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matchesDetail")
public class Match {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private Integer homeID; //team id for home
	@Column(nullable = false)
	private Integer awayID; //team id for away
	@Column(nullable = false)
	private Integer leagueID; //matches league
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getHomeID() {
		return homeID;
	}
	public void setHomeID(Integer homeID) {
		this.homeID = homeID;
	}
	public Integer getAwayID() {
		return awayID;
	}
	public void setAwayID(Integer awayID) {
		this.awayID = awayID;
	}
	public Integer getLeagueID() {
		return leagueID;
	}
	public void setLeagueID(Integer leagueID) {
		this.leagueID = leagueID;
	}
	

}
