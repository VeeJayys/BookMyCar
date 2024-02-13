package book.my.car.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.my.car.entity.User;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

	//public Optional<User> findByEmail(String email);

	public Optional<User> findByEmail(String emailId);
}
