package pl.siwiec.event;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.siwiec.users.User;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Size(min = 2, max =50)
    private String title;
    @Size(min = 2, max =50)
    private String description;
    @Size(min = 0, max =255)
    private String location;
    @Future
    private Date date;
    @NotBlank
    @ManyToOne
    private User user;



}
