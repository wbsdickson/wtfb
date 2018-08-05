package com.ykyclm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ykyclm.entity.Player;
import com.ykyclm.service.PlayerService;



@Controller
@RequestMapping(value= {"/player", "/players"})
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@RequestMapping(value= {"","/list", "/view"})
    public String list(Model model) {
        List<Player> players = playerService.getPlayerList();
        model.addAttribute("players", players);
        return "player/listPlayer"; //這樣就跳到template 裡面個player/list.html
    }

	//1. add start
	@RequestMapping(value= {"/add", "/new"})
    public String newPlayer(Model model) {
        model.addAttribute("player", new Player());
        return "player/addPlayer";
    }
	@PostMapping ("/add")
	public String add(Player player) {
		playerService.save(player); //run insert sql..
		return "redirect:/player/list";
	}
	//1. add end
	
	//2. find start  = view
	@GetMapping("/find/{id}")
	public String find(@PathVariable("id") long id, Model model) {
		Player player = playerService.findPlayerById(id);
		model.addAttribute("player", player);
		return "player/viewPlayer";  //go to player detail page
	}
	//2. find end
	

	//3. edit
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model){
    	model.addAttribute("player", playerService.findPlayerById(id));
        return "player/editPlayer";
    }	
	
	@PostMapping ("/edit")
	public String edit(Player player) {
		playerService.edit(player); //run update sql
		return "redirect:../player/find/"+ player.getId(); //redirect to view detail
	}
	//3. edit end
	
	//4. delete
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		playerService.delete(id);
		return "redirect:/player/list";
	}	
	//4. delete end
}
