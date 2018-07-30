package com.ykyclm.service;

import com.ykyclm.entity.Team;
import java.util.List;

public interface TeamService {
	
	public List<Team> getTeamList();
	
	public Team findTeamById(long id);
	
	public void save(Team team);
	
	public void edit(Team team);
	
	public void delete(long id);

}
