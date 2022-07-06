package pl.siwiec.users;

import lombok.Getter;
import lombok.Setter;
import pl.siwiec.vievers.Vievers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String sex;






}
