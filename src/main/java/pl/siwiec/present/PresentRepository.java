package pl.siwiec.present;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.siwiec.present.Present;
import pl.siwiec.users.User;

import java.util.List;

public interface PresentRepository extends JpaRepository<Present, Long> {

    @Query(value = "select * from present order by rainting asc limit 5 ", nativeQuery = true )
    List<Present> lastFive () ;

}
