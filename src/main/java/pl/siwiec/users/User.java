package pl.siwiec.users;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.validator.constraints.UniqueElements;
import pl.siwiec.role.Role;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.util.Set;

@Entity
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Size(min = 3, max =20)
    @Column(unique = true)
    private String username;
    @NotBlank
    @Email
    private String email;

    private String password;
   @Size(min = 3, max =15)
    private String name;
   @Size(min = 3, max =15)
    private String surname;
    @Min(3)
    @Max(120)
    private int age;
    private String sex;
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;




}
