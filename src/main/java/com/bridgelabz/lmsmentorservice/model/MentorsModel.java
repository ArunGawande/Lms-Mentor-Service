package com.bridgelabz.lmsmentorservice.model;

import com.bridgelabz.lmsmentorservice.dto.MentorsDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Purpose : MentorsModel Are Used to Transfer the Data into Database
 * */
@Entity
@Table(name = "mentors")
@Data
public class MentorsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeId;
    private String firstName;
    private String lastName;
    private String mentorsType;
    private String mentorRole;
    private String mobileNumber;
    private String email;
    private String experienceYears;
    private String preferredTime;
    private String status;
    private String mentorDesc;
    private String profilePic;
    private LocalDate startDate;
    private int creatorUser;
    private long supervisorId;
    private LocalDateTime createdTimeStamp;
    private LocalDateTime updatedTimeStamp;


    public MentorsModel(MentorsDTO mentorsDTO) {
        this.employeeId = mentorsDTO.getEmployeeId();
        this.firstName = mentorsDTO.getFirstName();
        this.lastName = mentorsDTO.getLastName();
        this.mentorsType = mentorsDTO.getMentorsType();
        this.mentorRole = mentorsDTO.getMentorRole();
        this.mobileNumber = mentorsDTO.getMobileNumber();
        this.email = mentorsDTO.getEmail();
        this.experienceYears = mentorsDTO.getExperienceYears();
        this.preferredTime = mentorsDTO.getPreferredTime();
        this.status = mentorsDTO.getStatus();
        this.mentorDesc = mentorsDTO.getMentorDesc();
        this.startDate = mentorsDTO.getStartDate();
        this.creatorUser = mentorsDTO.getCreatorUser();
        this.supervisorId = mentorsDTO.getSupervisorId();
    }

    public MentorsModel() {

    }
}