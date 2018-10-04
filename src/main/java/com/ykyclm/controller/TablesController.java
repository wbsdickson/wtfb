package com.ykyclm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ykyclm.entity.Tables;
import com.ykyclm.entity.Team;
import com.ykyclm.service.PlayerService;
import com.ykyclm.service.TablesService;
import com.ykyclm.service.TeamService;



@Controller
@RequestMapping("/tables")
public class TablesController {

	@Autowired
	TablesService tablesService;
	
	@RequestMapping("/")
    public String listTable(Model model) {
		List<Tables> tables = tablesService.getTablesList();
		model.addAttribute("tables", tables);
		//model.addAttribute("season", tables.get(0).getYear());
		model.addAttribute("season", "2018 - 2019");
        return "tables/tables";   //這樣就跳到template 裡面個team/list.html
    }
}
