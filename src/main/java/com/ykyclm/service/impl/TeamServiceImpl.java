package com.ykyclm.service.impl;

import java.util.List;
import java.util.Set;

import com.ykyclm.entity.Player;
import com.ykyclm.entity.Team;
import com.ykyclm.repository.PlayerRepository;
import com.ykyclm.repository.TeamRepository;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
    private TeamRepository teamRepository;

	@Override
	public List<Team> getTeamList() {
		return teamRepository.findAll();
	}

	@Override
	public Team findTeamById(long id) {
		return teamRepository.findById(id);
	}

	@Override
	public void save(Team team) {
		teamRepository.save(team);
	}

	@Override
	public void edit(Team team) {
		teamRepository.save(team);
	}

	@Override
	public void delete(long id) {
		teamRepository.deleteById(id);
	}

	@Override
	public Set<Team> listByLeagueId(long league_ID) {
		return teamRepository.findByLeagueId(league_ID);
	}
	
	
		

}
