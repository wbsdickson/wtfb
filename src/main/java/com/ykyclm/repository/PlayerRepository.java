package com.ykyclm.repository;

import com.ykyclm.entity.Player;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	Player findById(long id);
	void deleteById(Long id);
	Set<Player> findByTeamsId (long team_id);
}
