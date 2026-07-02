package com.balu.ipldashboard.controller;

import com.balu.ipldashboard.model.Team;
import com.balu.ipldashboard.repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        System.out.println("Searching for: " + teamName);
        return this.teamRepository.findByTeamNameIgnoreCaseContaining(teamName);
    }
}
