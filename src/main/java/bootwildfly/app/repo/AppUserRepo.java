package bootwildfly.app.repo;

import java.util.List;

import bootwildfly.app.model.AppUser;

//@Repository
public interface AppUserRepo
//extends JpaRepository<AppUser, Long> 
{

	List<AppUser> findByNameStartsWithIgnoreCase(String name);

}
