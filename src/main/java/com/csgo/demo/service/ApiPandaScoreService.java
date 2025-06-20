package com.csgo.demo.service;

import com.csgo.demo.model.MatchData;

import com.csgo.demo.model.MyGame;
import com.csgo.demo.model.WinnerResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class ApiPandaScoreService {
    private final RestTemplate restTemplate;
    private String token;

    public ApiPandaScoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.token = "OFlV2X8ads7RA5AzJBfUq_IYjkzT-iwG5XzZeP4C3_-xHwbIH4Q";
    }

    public List<WinnerResponse> getMatches() throws JsonProcessingException {
        String url = "https://api.pandascore.co/csgo/matches/past?token=" + token;

        ResponseEntity<List<WinnerResponse>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<WinnerResponse>>() {}
        );

        List<WinnerResponse> winners = response.getBody();
        return winners;
    }

}
