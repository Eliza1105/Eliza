package itstep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(25) default 'Jane'")
    private String firstName;

    @Column(columnDefinition = "varchar(25) default 'Doe'")
    private String lastName;

    private String
            email="js@gmail.com";
    private String phoneNumber;
}
