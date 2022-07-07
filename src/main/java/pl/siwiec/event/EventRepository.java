package pl.siwiec.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.siwiec.present.Present;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "select * from event where user_id = ?", nativeQuery = true )
    List<Event> eventUser (long user_id) ;
}
