package com.ykyclm.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykyclm.entity.League;
import com.ykyclm.entity.Team;
import com.ykyclm.repository.LeagueRepository;
import com.ykyclm.service.LeagueService;


@Service
public class LeagueServiceImpl implements LeagueService{

	@Autowired
    private LeagueRepository leagueRepository;

	@Override
	public List<League> getLeagueList() {
		return leagueRepository.findAll();
	}

	@Override
	public League findLeagueById(long id) {
		return leagueRepository.findById(id);
	}

	@Override
	public void save(League league) {
		leagueRepository.save(league);
	}

	@Override
	public void edit(League league) {
		leagueRepository.save(league);
	}

	@Override
	public void delete(long id) {
		leagueRepository.deleteById(id);
	}

	


}
