package com.ykyclm.api;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ykyclm.entity.League;
import com.ykyclm.entity.Player;
import com.ykyclm.entity.Team;
import com.ykyclm.service.LeagueService;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;


@RestController
public class LeagueAPIController {
	
	@Autowired
	LeagueService leagueService;
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(value = "/api/leagues", method = RequestMethod.GET)// @id = rank within the league
	public List<League> listLeague() {
		List<League> league = leagueService.getLeagueList();      
		return league;
	}
	
	
	//Premier League=1 //la liga=2
	@RequestMapping(value = "/api/{id}/table", method = RequestMethod.GET)// @id = rank within the league
	public Set<Team> listTable(@PathVariable("id") long id) {
		Set<Team> teams = teamService.listByLeagueId(id);      
		return teams;
	}
	
	@RequestMapping(value = "/api/{id}/{team_id}/squad", method = RequestMethod.GET)//	api/1/6/squad 
	public Set<Player> viewSquad(@PathVariable("team_id") long team_id) {
		Set<Player> players = playerService.listByTeamsId(team_id);
		return players;
	}
	

}