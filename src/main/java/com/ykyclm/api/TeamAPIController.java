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
public class TeamAPIController {
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping(value = "/api/teams", method = RequestMethod.GET)
	public List<Team> getAllTeams() {
		List<Team> teams = teamService.getTeamList();
        return teams;
    }
	

}