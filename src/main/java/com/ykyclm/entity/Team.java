package com.ykyclm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;

@Entity(name = "Team")
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String code;
	@Column(nullable = false)
	private String type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="countries_ID")
	@JsonIgnore
	private Country country;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="league_ID")
	@JsonIgnore
	private League league;
	
	
	
   
//@JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), 
//    inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id"))
	
//	@ManyToMany(cascade = { 
//        CascadeType.PERSIST, 
//        CascadeType.MERGE
//    })
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "team_player",
        joinColumns = @JoinColumn(name = "team_id"),
        inverseJoinColumns = @JoinColumn(name = "player_id")
    )
	@JsonIgnore
    private List<Player> players = new ArrayList<>();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	

	//methods
	public void addTag(Player player) {
		players.add(player);
		player.getTeams().add(this);
    }
 
    public void removeTag(Player player) {
    	players.remove(player);
    	player.getTeams().remove(this);
    }
	

	
		
	
}
