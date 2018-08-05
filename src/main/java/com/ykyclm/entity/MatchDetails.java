package com.ykyclm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "MatchesDetails")
@Table(name = "matchesDetails")
public class MatchDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date matchDate;
	
	private String homeTeam;
	private String awayTeam;
	
	private Integer hGoal;
	private Integer aGoal;
	
//	private List<Player> homeGoalList = new ArrayList<>();
//	private List<Player> awayGoalList = new ArrayList<>();
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matches_id")
	private Match match;
	

	public MatchDetails() {
		
	}
	
	//for creating a detail
	public MatchDetails(Date matchDate, String homeTeam, String awayTeam, Integer hGoal, Integer aGoal,
			Match match) {
		super();
		this.matchDate = matchDate;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.hGoal = hGoal;
		this.aGoal = aGoal;
		this.match = match;
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getMatchDate() {
		return  matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Integer gethGoal() {
		return hGoal;
	}

	public void sethGoal(Integer hGoal) {
		this.hGoal = hGoal;
	}

	public Integer getaGoal() {
		return aGoal;
	}

	public void setaGoal(Integer aGoal) {
		this.aGoal = aGoal;
	}

//	public List<Player> getHomeGoalList() {
//		return homeGoalList;
//	}
//
//	public void setHomeGoalList(List<Player> homeGoalList) {
//		this.homeGoalList = homeGoalList;
//	}
//
//	public List<Player> getAwayGoalList() {
//		return awayGoalList;
//	}
//
//	public void setAwayGoalList(List<Player> awayGoalList) {
//		this.awayGoalList = awayGoalList;
//	}

	public Match getMatch() {
		return match;
	}

	
	
	
	///*******
	public void setMatch(Match match) {
		// TODO Auto-generated method stub
		
	}



}
