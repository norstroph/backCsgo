package com.csgo.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.csgo.demo.model.Team;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/Team")
public class TeamControlleur {

    public List<Team> listTeam = List.of(
     new Team(1, "shox zwoo , apex, ",3, "https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/8/86/Team_Vitalitylogo_square.png/revision/latest/scale-to-width-down/220?cb=20230224142251", "vita")
    );

    @GetMapping("/{id}")
    public List<Team> getListTeamById(@PathVariable int id){
        return Collections.singletonList(listTeam.stream().filter(myTeam -> myTeam.getId() == id).findFirst()
                .orElse(null));

    };

    @GetMapping("")

    public List<Team> getListTeamAll(){
        return listTeam ;
    }
    @PostMapping("")
    public Team creatTeam(@RequestBody Team team){
        return team;
    }

}
