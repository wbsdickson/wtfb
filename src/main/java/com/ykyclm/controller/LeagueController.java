package com.ykyclm.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ykyclm.entity.League;
import com.ykyclm.entity.Player;
import com.ykyclm.entity.Team;
import com.ykyclm.service.LeagueService;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;

@Controller
@RequestMapping(value= {"/league", "/leagues"})
public class LeagueController {
	
	@Autowired
	LeagueService leagueService;
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	PlayerService playerService;
	
	//Premier League //la liga
	@RequestMapping("/{id}/table")  // @id = rank within the league
	public String listTable(@PathVariable("id") long id, Model model) {
		League league = leagueService.findLeagueById(id);
		model.addAttribute("league", league);	
		Set<Team> teams = teamService.listByLeagueId(id);
        model.addAttribute("teams", teams);
        
		return "league/teamTable";
	}
	
	@RequestMapping("/{id}/{team_id}/squad")  
	public String viewSquad(@PathVariable("team_id") long team_id, Model model) {
		Set<Player> players = playerService.listByTeamsId(team_id);
		model.addAttribute("players", players);
		return "player/listPlayer";
	}
	

}