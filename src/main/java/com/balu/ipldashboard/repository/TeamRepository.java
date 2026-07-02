package com.balu.ipldashboard.repository;

import com.balu.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>
{

    Team findByTeamNameIgnoreCaseContaining(String teamName);

}
