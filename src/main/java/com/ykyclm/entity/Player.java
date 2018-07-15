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
	private int age;
	@Column(nullable = true)
	private int height;
	@Column(nullable = true)
	private int weight;
	@Column(nullable = true)
	private String position;
	@Column(nullable = true)
	private String subPosition;
	@Column(nullable = true)
	private int shirt;
	@Column(nullable = true)
	private int countryID;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
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
	public int getShirt() {
		return shirt;
	}
	public void setShirt(int shirt) {
		this.shirt = shirt;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
}
