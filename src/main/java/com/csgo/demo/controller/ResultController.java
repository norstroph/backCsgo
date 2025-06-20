package com.csgo.demo.controller;

import com.csgo.demo.Repository.ResultRepository;
import com.csgo.demo.model.Result;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;


    @GetMapping("")
    public List<Result> getAll() {
        return resultRepository.findAll();
    }

    @PostMapping("")
    public Result create(@RequestBody Result myresult) {
        return resultRepository.save(myresult);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {
        return resultRepository.findById(id).orElse(null);
    }

}
