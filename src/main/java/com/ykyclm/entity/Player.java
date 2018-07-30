package com.ykyclm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
    @GeneratedValue
	private long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false, unique = true)
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
	public Integer getTeamID() {
		return teamID;
	}
	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	@Column(nullable = false)
	private Integer teamID;
	@Column(nullable = true)
	private Integer countryID;

}
