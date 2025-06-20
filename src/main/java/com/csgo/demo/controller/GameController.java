package com.csgo.demo.controller;
import com.csgo.demo.Repository.GameRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.csgo.demo.model.Game;

@RestController
@RequestMapping("/matches") // defini le andpoint
public class GameController {
    @Autowired
    private GameRepository matchRepository;

// crée notre liste d intance
    private List<Game> latches = List.of(
            new Game( "looooVitality vs G2", "2025-06-19"),
            new Game( "Nav vs FaZe", "2025-06-20"),
            new Game( "Mavi vs TaZe", "2025-07-20")

    );
    @PostConstruct
    public void init(){
        matchRepository.saveAll(latches);
    }

    @GetMapping("")
    public List<Game> getAllMatches() {
        return latches;
    }

    @GetMapping("/{id}") // declanche la metode quand l URL CONTIEN UN ID pres le /match
    public Game getMatchById(@PathVariable Long id) {
        // @PathVariable lie id mis dans l URL a celui de  linstance crée
        return latches.stream()
                .filter(match -> match.getId().equals(id))
                .findFirst()
                .orElse(null); // si elle et pas trouver elle return null
    }

    @PostMapping("")
    public Game createMatch(@RequestBody Game latch) {
    //@RequestBody passer les argument de la requet a la class Match et crée la nouvelle instance latch qui et return juste apres
        return latch;
    }
}
