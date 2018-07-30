package com.ykyclm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ykyclm.entity.Match;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface MatchRepository extends JpaRepository<Match, Long>{
	
	Match findById(long id);
	void deleteById(Long id);
}
