package pl.siwiec.groups;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.users.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class AppGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;




}
