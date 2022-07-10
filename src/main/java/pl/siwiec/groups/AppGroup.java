package pl.siwiec.groups;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter

public class AppGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @NotBlank
//    @Size(min = 2, max =50)
    private String name;
//    @Size(min = 0, max =5000)
    private String description;



}
