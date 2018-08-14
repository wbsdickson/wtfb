package com.ykyclm.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "league")
public class League {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String name; //league name
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countries_ID")
	@JsonIgnore
	private Country country; //team id for mapping which country of the league
	
	@Column(nullable = false)
	private Integer teamNums; //total num of teams within
	
	@Column(nullable = false)
	private Integer rank; //total num of teams within
	

	//list for getting all teams in this league
	@OneToMany(mappedBy = "league")
	@JsonIgnore
	private Set<Team> teams;
	
	
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
	public Country getCountryID() {
		return country;
	}
	public void setCountryID(Country country) {
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
	
	
	public Set<Team> getTeams() {
		return teams;
	}
	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

}
