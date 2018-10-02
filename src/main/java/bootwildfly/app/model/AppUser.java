package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class AppUser {

	private String appuserid;
	private String name;
 
	public String getAppuserid() {
		return appuserid;
	}

	public void setAppuserid(String appuserid) {
		this.appuserid = appuserid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppUser(String appuserid, String name) {
		super();
		this.appuserid = appuserid;
		this.name = name;
	}

	public AppUser() {

	}

}
