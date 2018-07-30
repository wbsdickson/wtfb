//package com.ykyclm.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ykyclm.entity.Match;
//import com.ykyclm.repository.MatchRepository;
//import com.ykyclm.service.MatchService;
//
//
////@Service
//public class MatchServiceImpl implements MatchService{
//
//	@Autowired
//    private MatchRepository matchRepository;
//	
//	
//	@Override
//	public List<Match> getMatchList() {
//		return matchRepository.findAll();
//	}
//
//	@Override
//	public Match findMatchById(long id) {
//		return matchRepository.getOne(id);
//	}
//
//	@Override
//	public void save(Match match) {
//		matchRepository.save(match);
//	}
//
//	@Override
//	public void edit(Match match) {  //edit = re-save
//		matchRepository.save(match);
//	}
//
//	@Override
//	public void delete(long id) {
//		matchRepository.deleteById(id);
//	}
//
//
//}
