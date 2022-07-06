package pl.siwiec.event;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.staticsEnum.Role;
import pl.siwiec.users.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String location;
    private Date date;
    @ManyToOne
    private User user;



}
