package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="Design")
public class hibernate {
	@Autowired
	@Id
	@Column(name="Id")
	private long id;
	@Column(name="Name")
	private String name;
	@Column(name="Desigination")
	private String desigination;
	public hibernate(long id, String name, String desigination) {
		super();
		this.id = id;
		this.name = name;
		this.desigination = desigination;
	}
	public hibernate()
	{
		
	}
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
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
}
