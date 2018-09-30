package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser01")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class AppUser {

	@Id
	private String appuserid;
	@Column(nullable = false)
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
