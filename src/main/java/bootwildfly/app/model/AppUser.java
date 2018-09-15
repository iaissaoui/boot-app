package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(nullable = false)
	private String name;

}
