package com.ykyclm.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "Player")
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String surname;
	@Column(nullable = true)
	private Integer age;
	@Column(nullable = true)
	private Integer height;
	@Column(nullable = true)
	private Integer weight;
	@Column(nullable = true)
	private String position;
	@Column(nullable = true)
	private String subPosition;
	@Column(nullable = true)
	private Integer shirt;
	
	@ManyToMany(mappedBy = "players")
    private List<Team> teams = new ArrayList<>();
	
	
	
	public Player() {
	}
	
	
	public Player( String firstName, String surname, Integer age, Integer height, Integer weight,
			String position, String subPosition, Integer shirt) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.position = position;
		this.subPosition = subPosition;
		this.shirt = shirt;
	}




	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSubPosition() {
		return subPosition;
	}
	public void setSubPosition(String subPosition) {
		this.subPosition = subPosition;
	}
	public Integer getShirt() {
		return shirt;
	}
	public void setShirt(Integer shirt) {
		this.shirt = shirt;
	}

	
	//methods
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
}
