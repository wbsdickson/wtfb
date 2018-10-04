package com.ykyclm.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ykyclm.entity.League;
import com.ykyclm.entity.Tables;
import com.ykyclm.entity.Team;

/**
 * Interface for use
 * @author kaiyin
 *
 */

public interface TablesRepository extends JpaRepository<Tables, Long>{
	
	Tables findById(long id);
	void deleteById(Long id);
	
}
