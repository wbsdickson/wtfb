package com.ykyclm.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tables")
public class Tables {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "league_id")
	private League league;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="team_id")
	private Team team;
	
	private Integer year;
	private Integer GamesPlayed;
	private Integer Wins;
	private Integer Draws;
	private Integer Loses;
	private Integer GoalsFor;
	private Integer GoalsAgainst;
	private Integer GoalsDiff;
	private Integer Points;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getGamesPlayed() {
		return GamesPlayed;
	}
	public void setGamesPlayed(Integer gamesPlayed) {
		GamesPlayed = gamesPlayed;
	}
	public Integer getWins() {
		return Wins;
	}
	public void setWins(Integer wins) {
		Wins = wins;
	}
	public Integer getDraws() {
		return Draws;
	}
	public void setDraws(Integer draws) {
		Draws = draws;
	}
	public Integer getLoses() {
		return Loses;
	}
	public void setLoses(Integer loses) {
		Loses = loses;
	}
	public Integer getGoalsFor() {
		return GoalsFor;
	}
	public void setGoalsFor(Integer goalsFor) {
		GoalsFor = goalsFor;
	}
	public Integer getGoalsAgainst() {
		return GoalsAgainst;
	}
	public void setGoalsAgainst(Integer goalsAgainst) {
		GoalsAgainst = goalsAgainst;
	}
	public Integer getGoalsDiff() {
		return GoalsDiff;
	}
	public void setGoalsDiff(Integer goalsDiff) {
		GoalsDiff = goalsDiff;
	}
	public Integer getPoints() {
		return Points;
	}
	public void setPoints(Integer points) {
		Points = points;
	}

}
