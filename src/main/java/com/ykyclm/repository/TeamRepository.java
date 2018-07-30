package com.ykyclm.repository;

import com.ykyclm.entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface TeamRepository extends JpaRepository<Team, Long>{
	
	Team findById(long id);
	void deleteById(Long id);
}
