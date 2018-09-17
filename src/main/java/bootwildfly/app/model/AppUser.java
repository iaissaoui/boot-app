package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "appuser")
public @Data @AllArgsConstructor @NoArgsConstructor class AppUser {

	@Id
	private Long id;
	@Column(nullable = false)
	private String name;

}
