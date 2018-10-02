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
	private Long id;
	@Column(nullable = false)
	private String name;
 

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

	public AppUser(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AppUser() {

	}

}
