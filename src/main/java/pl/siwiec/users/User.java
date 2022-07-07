package pl.siwiec.users;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.groups.AppGroup;
import pl.siwiec.role.Role;
import pl.siwiec.staticsEnum.Sex;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @ManyToMany
    private List<AppGroup> groups = new ArrayList<>();



}
