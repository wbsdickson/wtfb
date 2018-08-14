package com.ykyclm.service;

import com.ykyclm.entity.League;
import com.ykyclm.entity.Team;

import java.util.List;
import java.util.Set;

public interface LeagueService {
	
	public List<League> getLeagueList();
	
	public League findLeagueById(long id);
	
	public void save(League league);
	
	public void edit(League league);
	
	public void delete(long id);
}
