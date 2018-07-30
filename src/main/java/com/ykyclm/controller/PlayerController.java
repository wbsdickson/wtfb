package com.ykyclm.controller;

import com.ykyclm.entity.Player;
import com.ykyclm.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;



@Controller
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	PlayerService playerService;

//	@RequestMapping("/")
//    public String index() {
//        return "players/list";  //這樣就跳到template 裡面個list.html
//    }

	@RequestMapping("/list")
    public String list(Model model) {
        List<Player> players = playerService.getPlayerList();
        model.addAttribute("players", players);
        return "player/list";
    }
}
