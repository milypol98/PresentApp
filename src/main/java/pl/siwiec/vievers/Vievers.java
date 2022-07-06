package pl.siwiec.vievers;


import lombok.Getter;
import lombok.Setter;
import pl.siwiec.event.Event;
import pl.siwiec.users.User;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Vievers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @OneToOne
    private Event event;
}
