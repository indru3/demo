package com.xworkz.newyear.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Integer userId;

    @NotNull(message = "First Name cannot be null")
    @Size(min = 3, max = 25, message = "First Name should be between 3 and 25 characters")
    private String firstName;

   @NotNull(message = "Last Name cannot be null")
    @Size(min = 3, max = 25, message = "Last Name should be between 3 and 25 characters")
    private String lastName;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Alternate Email cannot be null")
    @Email(message = "Alternate Email should be valid")
    private String alternateEmail;

    @NotNull(message = "Contact number cannot be null")
    @Digits(integer = 10, fraction = 0, message = "Contact number should be 10 digits")
    private Long contact;

    @NotNull(message = "Alternate Contact number cannot be null")
    @Digits(integer = 10, fraction = 0, message = "Alternate Contact number should be 10 digits")
    private Long alternateContact;

    @NotNull(message = "Date of Birth cannot be null")
    @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "Date of Birth must be in dd/MM/yyyy format")
    private String dateOfBirth;

    @NotNull(message = "Place cannot be null")
    @Size(min = 2, max = 50, message = "Place should be between 2 and 50 characters")
    private String place;

    @NotNull(message = "State cannot be null")
    @Size(min = 2, max = 50, message = "State should be between 2 and 50 characters")
    private String state;

    @NotNull(message = "District cannot be null")
    @Size(min = 2, max = 50, message = "District should be between 2 and 50 characters")
    private String district;

    @NotNull(message = "Password cannot be null")
    @Size(min = 6, max = 20, message = "Password should be between 6 and 20 characters")
    private String password;

    @NotNull(message = "Confirm Password cannot be null")
    @Size(min = 6, max = 20, message = "Confirm Password should be between 6 and 20 characters")
    private String confirmPassword;

    @NotNull(message = "Created By cannot be null")
    @Size(min = 3, max = 50, message = "Created By should be between 3 and 50 characters")
    private String createdBy;

    @NotNull(message = "Created Date cannot be null")
    private LocalDate createdDate;

    @NotNull(message = "Updated By cannot be null")
    @Size(min = 3, max = 50, message = "Updated By should be between 3 and 50 characters")
    private String updatedBy;

    @NotNull(message = "Updated Date cannot be null")
    private LocalDate updatedDate;
}
