package com.ykyclm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ykyclm.entity.Player;
import com.ykyclm.entity.Team;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TeamService;


@RestController
public class PlayerAPIController {

	@Autowired
	PlayerService playerService;
	
	@RequestMapping("/hello") //for testing
    public String index() {
        return "Hello World";
    }
	
	@RequestMapping(value = "/api/players", method = RequestMethod.GET)
    public List<Player> getAllPlayers() {
		List<Player> players = playerService.getPlayerList();
        return players;
    }
	

}
