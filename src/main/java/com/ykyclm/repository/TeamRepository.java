package com.ykyclm.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ykyclm.entity.Team;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface TeamRepository extends JpaRepository<Team, Long>{
	
	Team findById(long id);
	void deleteById(Long id);
	Set<Team> findByLeagueId(long league_id);
	
}
