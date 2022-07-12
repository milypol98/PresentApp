package pl.siwiec.present;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.users.User;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Getter
@Setter
public class Present {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Size(min = 2, max =50)
    private String title;
    @Size(min = 2, max =500)
    private String description;
    private int rainting;
    @ManyToOne
    private User user;


}
