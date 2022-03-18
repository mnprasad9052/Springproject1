package com.simple.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getMobiletype() {
		return mobiletype;
	}
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}
	private String mobilename;
	private String mobiletype;

}
