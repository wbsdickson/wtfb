package com.ykyclm.entity.vo;

import java.util.Set;

public class PlayerVo {
	
	private long id;
	private String firstName;
	private String surname;
	private Integer age;
	private Integer height;
	private Integer weight;
	private String position;
	private String subPosition;
	private Integer shirt;
	private Set<TeamVo> teams;
	
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
	public Set<TeamVo> getTeams() {
		return teams;
	}
	public void setTeams(Set<TeamVo> teams) {
		this.teams = teams;
	}
	
}
