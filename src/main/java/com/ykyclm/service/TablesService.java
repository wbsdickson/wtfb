package com.ykyclm.service;

import com.ykyclm.entity.Tables;
import java.util.List;
import java.util.Set;

public interface TablesService {
	
	public List<Tables> getTablesList();
	
	public Tables findTablesById(long id);
	
	public void save(Tables Tables);
	
	public void edit(Tables Tables);
	
	public void delete(long id);
	
//	public Set<Tables> listByTablesId(long league_ID);

}
