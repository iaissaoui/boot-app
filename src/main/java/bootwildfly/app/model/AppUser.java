package bootwildfly.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "s_appuser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
 
	@Id
	private String appuserid;
	@Column(nullable = false)
	private String name;
 
 
}
