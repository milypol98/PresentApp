package pl.siwiec.present;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.users.User;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Present {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private int rainting;
    @ManyToOne
    private User user;


}
