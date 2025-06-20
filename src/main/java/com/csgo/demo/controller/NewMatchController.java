package com.csgo.demo.controller;

import com.csgo.demo.model.MatchData;
import com.csgo.demo.model.Team;
import com.csgo.demo.model.WinnerResponse;
import com.csgo.demo.service.ApiPandaScoreService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class NewMatchController {

    private final ApiPandaScoreService pandaScoreService;

    public NewMatchController(ApiPandaScoreService pandaScoreService) {
        this.pandaScoreService = pandaScoreService;
    }

    @GetMapping("/matches/past")
    public List<WinnerResponse> getMatches() throws JsonProcessingException {
        return pandaScoreService.getMatches();
    }
}
