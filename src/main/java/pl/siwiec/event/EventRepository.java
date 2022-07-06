package pl.siwiec.event;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.siwiec.present.Present;

public interface EventRepository extends JpaRepository<Event, Long> {
}
