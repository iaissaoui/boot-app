package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser")
//@Data @AllArgsConstructor @NoArgsConstructor
public class AppUser {

	@Id
	private String id;
	@Column(nullable = false)
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppUser(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AppUser() {

	}

}
