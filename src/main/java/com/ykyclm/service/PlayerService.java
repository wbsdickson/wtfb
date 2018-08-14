package com.ykyclm.service;

import com.ykyclm.entity.Player;
import com.ykyclm.entity.Team;

import java.util.List;
import java.util.Set;

public interface PlayerService {
	
	public List<Player> getPlayerList();
	
	public Player findPlayerById(long id);
	
	public void save(Player player);
	
	public void edit(Player player);
	
	public void delete(long id);
	
	public Set<Player> listByTeamsId(long team_id);

}
