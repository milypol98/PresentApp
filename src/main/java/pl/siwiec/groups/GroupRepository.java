package pl.siwiec.groups;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.siwiec.present.Present;

public interface GroupRepository  extends JpaRepository<Group, Long> {
}
