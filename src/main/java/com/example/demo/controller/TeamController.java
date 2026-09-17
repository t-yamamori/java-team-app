package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.KanaiService;
import com.example.service.KojiService;

@Controller
public class TeamController {
	@Autowired private KanaiService kanaiService;
	@Autowired private KojiService kojiService;
	
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
        // TODO: ここにメンバーのServiceを後で呼ぶ
        model.addAttribute("kanaiMsg",kanaiService.getProfile());
        model.addAttribute("kojiService",kojiService.getProfile());
        
        return "index";
    }
}
