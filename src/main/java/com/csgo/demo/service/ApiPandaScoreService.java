package com.csgo.demo.service;

import com.csgo.demo.model.MatchData;

import com.csgo.demo.model.MyGame;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiPandaScoreService {
    private final RestTemplate restTemplate;
    private String token;

    public ApiPandaScoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.token = "OFlV2X8ads7RA5AzJBfUq_IYjkzT-iwG5XzZeP4C3_-xHwbIH4Q";
    }
    public List<MatchData> getMatches() throws JsonProcessingException {
        String url = "https://api.pandascore.co/csgo/matches/past?token=" + token;
        MyGame json = restTemplate.getForObject(url, MyGame.class);
        System.out.println(json);
        //
//        if (json.contains("\"status\":\"fail\"")) {
//            System.err.println("Erreur côté API distante : " + json);
//            return List.of(); // ou tu peux lancer une exception ici
//        } else {
//            ObjectMapper mapper = new ObjectMapper();
//            MatchData[] matches = mapper.readValue(json, MatchData[].class);
//            return Arrays.asList(matches);
//        }
        return new ArrayList<>();
    }
}
