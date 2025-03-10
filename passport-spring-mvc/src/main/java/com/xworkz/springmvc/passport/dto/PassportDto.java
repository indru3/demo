package com.xworkz.springmvc.passport.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "passport_details")
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query = "from PassportDto"),
        @NamedQuery(name = "updateUser", query = "update PassportDto dto set dto.firstName= :firstName, dto.lastName= :lastName, dto.phoneNumber= :phoneNumber, dto.email= :email, dto.address = :address, dto.age= :age, dto.country= :country where dto.id= :id"),
        @NamedQuery(name = "deleteUserById", query="delete from PassportDto dto where dto.id=:id")
})

public class PassportDto implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    /*@Column(name = "DateOfBirth")
    private Date DateOfBirth;*/

    @Column(name = "phoneNumber")
    private long phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "country")
    private String country;

}
