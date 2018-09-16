package bootwildfly.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity

public @Data @AllArgsConstructor @NoArgsConstructor class AppUser {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
//	@Column(nullable = false)
	private String name;

}
