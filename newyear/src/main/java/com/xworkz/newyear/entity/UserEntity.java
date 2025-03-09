package com.xworkz.newyear.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@Table(name = "registration_info")
@NamedQueries({
        @NamedQuery(name = "getEntityByEmail", query = "SELECT entity FROM UserEntity entity WHERE entity.email = :Email"),
        @NamedQuery(name = "updatePasswordByEmail",query = "UPDATE UserEntity s SET s.password = :password,s.confirmPassword=:confirmPassword WHERE s.email = :email")
})
public class UserEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "alternate_email")
    private String alternateEmail;
    @Column(name = "contact")
    private Long contact;
    @Column(name = "alternate_contact")
    private Long alternateContact;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "place")
    private String place;
    @Column(name = "state")
    private String state;
    @Column(name = "district")
    private String district;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
    @Column(name = "createdby")
    private String createdBy;
    @Column(name = "created_date")
    private LocalDate createdDate;
    @Column(name = "updatedby")
    private String updatedBy;
    @Column(name = "updated_date")
    private LocalDate updatedDate;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "fileType")
    private String fileType;
}
