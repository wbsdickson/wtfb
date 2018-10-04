package com.ykyclm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykyclm.entity.Tables;
import com.ykyclm.repository.TablesRepository;
import com.ykyclm.service.TablesService;


@Service
public class TablesServiceImpl implements TablesService{

	@Autowired
    private TablesRepository tablesRepository;

	@Override
	public List<Tables> getTablesList() {
		return tablesRepository.findAll();
	}

	@Override
	public Tables findTablesById(long id) {
		return tablesRepository.findById(id);
	}

	@Override
	public void save(Tables tables) {
		tablesRepository.save(tables);
	}

	@Override
	public void edit(Tables tables) {
		tablesRepository.save(tables);
	}

	@Override
	public void delete(long id) {
		tablesRepository.deleteById(id);
	}

	


}
