package recozilla.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "recozilla_accounts")

public class RecozillaDto {

    @GenericGenerator(name = "value",strategy = "increment")
    @GeneratedValue(generator = "value")
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "phoneNum")
    private long phoneNum;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "city")
    private String city;
    @Column(name = "pinCode")
    private int pincode;
}
