package pl.siwiec.users;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.siwiec.present.Present;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
