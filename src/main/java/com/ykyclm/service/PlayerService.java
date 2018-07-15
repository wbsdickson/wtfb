package com.ykyclm.service;

import com.ykyclm.entity.Player;
import java.util.List;

public interface PlayerService {
	
	public List<Player> getPlayerList();
	
	public Player findPlayerById(long id);
	
	public void save(Player player);
	
	public void edit(Player player);
	
	public void delete(long id);

}
