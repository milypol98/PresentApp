package pl.siwiec.users;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.staticsEnum.Role;
import pl.siwiec.staticsEnum.Sex;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private Role role;
//    @ManyToMany
//    private List<Groups> groups = new ArrayList<>();



}
