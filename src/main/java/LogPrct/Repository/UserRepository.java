package LogPrct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LogPrct.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
