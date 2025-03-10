package com.xworkz.springmvc.job.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "job_details")
@NamedQueries({
        @NamedQuery(name = "getAllUsers",query = "from JobDto"),
        @NamedQuery(name = "updateUser",query = "update JobDto dto set dto.firstName=:firstName, dto.lastName= :lastName, dto.phone=:phone, dto.email=:email, dto.city=:city where dto.id=:id"),
        @NamedQuery(name = "deleteUserById",query = "delete from JobDto dto where dto.id=:id")

})


public class JobDto implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone")
    private long phone;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;
}
