package com.ykyclm.api;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
import com.ykyclm.entity.vo.TeamVo;
import com.ykyclm.service.LeagueService;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;

@RestController
public class TeamAPIController {
	@Resource(name="modelMapper")
	private ModelMapper modelMapper;
	
	@Autowired
	TeamService teamService;
	
	//
	@RequestMapping(value = "/api/teams", method = RequestMethod.GET)
	public List<TeamVo> getAllTeams() {
		List<Team> teams = teamService.getTeamList();
		List<TeamVo> listTeamVo = modelMapper.map(teams, new TypeToken<List<TeamVo>>(){}.getType());
        return listTeamVo;
    }
	

}