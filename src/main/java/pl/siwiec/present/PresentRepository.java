package pl.siwiec.present;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.siwiec.present.Present;

public interface PresentRepository extends JpaRepository<Present, Long> {

}
