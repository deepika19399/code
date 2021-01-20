package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PETDETAIL")
public class PetDetail implements Serializable{

	private static final long serialVersionUID = -3465813074586302848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String petname;

	@Column
	private String age;
	
	@Column
	private String placefrom;
	
	@Column
	private String cost;

	@Column(name = "petcount", nullable = false, columnDefinition = "int default 0") 
	private int petcount;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPlacefrom() {
		return placefrom;
	}

	public void setPlacefrom(String placefrom) {
		this.placefrom = placefrom;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public int getPetcount() {
		return petcount;
	}

	public void setPetcount(int petcount) {
		this.petcount = petcount;
	}
	
}

