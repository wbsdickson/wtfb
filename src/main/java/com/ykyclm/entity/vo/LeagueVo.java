package com.ykyclm.entity.vo;

import java.util.Set;

public class LeagueVo {
	
	private long id;
	private String name; //league name
	private CountryVo country; //team id for mapping which country of the league
	private Integer teamNums; //total num of teams within
	private Integer rank; //total num of teams within
	private Set<TeamVo> teams;
	
	
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
	public CountryVo getCountry() {
		return country;
	}
	public void setCountry(CountryVo country) {
		this.country = country;
	}
	public Integer getTeamNums() {
		return teamNums;
	}
	public void setTeamNums(Integer teamNums) {
		this.teamNums = teamNums;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Set<TeamVo> getTeams() {
		return teams;
	}
	public void setTeams(Set<TeamVo> teams) {
		this.teams = teams;
	}
}
