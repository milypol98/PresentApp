package pl.siwiec.event;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import pl.siwiec.present.Present;
import pl.siwiec.users.User;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

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
    @Size(min = 2, max =500)
    private String description;
    @Size(min = 1, max =255)
    private String location;

    private Date date;

    @ManyToOne
    private User user;
    @OneToMany
    private List<Present> present;



}
