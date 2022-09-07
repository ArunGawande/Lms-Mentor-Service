package com.bridgelabz.lmsmentorservice.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

  // Purpose : MentorsDTO fields are Used to Create and Update Mentors Details


@Data
public class MentorsDTO {
    @NotNull(message = "employeeId can't be empty")
    private String employeeId;
    @Pattern(regexp = "[A-Z][a-z]{2,}", message = "Invalid firstName")
    private String firstName;
    @Pattern(regexp = "[A-Z][a-z]{2,}", message = "Invalid lastName")
    private String lastName;
    @NotNull(message = "mentorsType can't be empty")
    private String mentorsType;
    @NotNull(message = "mentorRole can't be empty")
    private String mentorRole;
    @Pattern(regexp = "[6789][0-9]{9}", message = "Invalid mobile number")
    private String mobileNumber;
    @Pattern(regexp = "(\\w+[.+-]?)*@\\w+(\\.+[a-zA-Z]{2,4})*", message = "Invalid Email, Enter correct Email")
    private String email;
    @NotNull(message = "experienceYears can't be empty")
    private String experienceYears;
    @NotNull(message = "preferredTime can't be empty")
    private String preferredTime;
    @NotNull(message = "status can't be empty")
    private String status;
    @NotNull(message = "mentorDesc can't be empty")
    private String mentorDesc;
    @NotNull(message = "startDate can't be null")
    private LocalDate startDate;
    @NotNull(message = "creatorUser can't be empty")
    private int creatorUser;
    @NotNull(message = "supervisorId can't be empty")
    private long supervisorId;
}