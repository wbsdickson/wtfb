package com.ykyclm.service.impl;

import java.util.List;

import com.ykyclm.entity.Player;
import com.ykyclm.repository.PlayerRepository;
import com.ykyclm.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
    private PlayerRepository playerRepository;
	
	
	@Override
	public List<Player> getPlayerList() {
		return playerRepository.findAll();
	}

	@Override
	public Player findPlayerById(long id) {
		return playerRepository.findById(id);
	}

	@Override
	public void save(Player player) {
		playerRepository.save(player);
	}

	@Override
	public void edit(Player player) {  //edit = re-save
		playerRepository.save(player);
	}

	@Override
	public void delete(long id) {
		playerRepository.deleteById(id);
	}


}
