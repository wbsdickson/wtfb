package com.ykyclm.api;

import java.util.List;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ykyclm.entity.Player;
import com.ykyclm.entity.vo.PlayerVo;
import com.ykyclm.service.PlayerService;


@RestController
public class PlayerAPIController {
	
	@Resource(name="modelMapper")
	private ModelMapper modelMapper;
	
	@Autowired
	PlayerService playerService;

	@RequestMapping(value = "/api/players", method = RequestMethod.GET)
    public List<PlayerVo> getAllPlayers() {
		List<Player> players = playerService.getPlayerList();
		List<PlayerVo> listPlayerVo = modelMapper.map(players, new TypeToken< List<PlayerVo>>(){}.getType());
        return listPlayerVo;
    }
	

}
