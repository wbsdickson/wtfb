package com.ykyclm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ykyclm.entity.Team;
import com.ykyclm.service.TeamService;



@Controller
@RequestMapping("/news")
public class NewsController {


	@RequestMapping("/")
    public String index() {
        return "news/news";   //這樣就跳到template 裡面個team/list.html
    }
}
