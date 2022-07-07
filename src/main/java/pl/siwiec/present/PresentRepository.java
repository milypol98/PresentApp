package pl.siwiec.present;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.siwiec.present.Present;
import pl.siwiec.users.User;

import java.util.List;

public interface PresentRepository extends JpaRepository<Present, Long> {

//    @Query(value = "select * from present order by rainting asc limit 5 ", nativeQuery = true )
//    List<Present> lastFive () ;


    @Query(value = "select * from present where user_id = ? order by rainting desc limit 5 ", nativeQuery = true )
    List<Present> presentUserlimit5 (long user_id) ;

    @Query(value = "select * from present where user_id = ?", nativeQuery = true )
    List<Present> presentUser (long user_id) ;


}
