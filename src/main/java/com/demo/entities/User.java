package com.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="Name", nullable=false,length=45)
	private String name;
	
	@Column(name="Phy", nullable=false,length=45)
	private int phy;
	
	@Column(name="Chem", nullable=false,length=45)
	private int chem;
	
	@Column(name="Maths", nullable=false,length=45)
	private int maths;
	
	@Column(name="Bio", nullable=false,length=45)
	private int biology;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChem() {
		return chem;
	}

	public void setChem(int chem) {
		this.chem = chem;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}
	@Column(name="totalScore", nullable=false,length=45)
	private  long totalScore;
	

}
