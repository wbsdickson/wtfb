package com.ykyclm.repository;

import com.ykyclm.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	Player findById(long id);
	void deleteById(Long id);
}
