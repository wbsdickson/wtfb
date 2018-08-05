package com.ykyclm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

@Entity(name = "Matches")
@Table(name = "matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private Integer homeID;
	private Integer awayID;
	
	@OneToOne(
			mappedBy = "match",  //for mapping MatchDetails => field name of "Match"
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			fetch = FetchType.LAZY
		)
	@LazyToOne( LazyToOneOption.NO_PROXY )
	private MatchDetails details;
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public MatchDetails getDetails() {
		return details;
	}

	public void setDetails(MatchDetails details) {
		this.details = details;
	}
	
	
	
	//add match dtl
	public void addDetails(MatchDetails details) {
		details.setMatch (this);
		this.details = details;
	}
	
	//del match dtl
	public void removeDetails() {
		if ( details != null ) {
			details.setMatch( null );
			this.details = null;
		}
	}

}
