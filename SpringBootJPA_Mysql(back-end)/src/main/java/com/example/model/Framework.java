package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Framework {
	
	
	
	public Framework() {
		super();
	}
	public Framework(String modules, String version) {
		super();
		this.modules = modules;
		this.version = version;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String modules;
	private String version;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "Frameworks [id=" + id + ", modules=" + modules + ", version=" + version + "]";
	}
	
}
