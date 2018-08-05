package com.ykyclm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ykyclm.entity.Team;
import com.ykyclm.service.TeamService;



@Controller
@RequestMapping("/team")
public class TeamController {

	@Autowired
	TeamService teamService;

	@RequestMapping("/list")
    public String list(Model model) {
        List<Team> teams = teamService.getTeamList();
        model.addAttribute("teams", teams);
        return "team/list";   //這樣就跳到template 裡面個team/list.html
    }
}
