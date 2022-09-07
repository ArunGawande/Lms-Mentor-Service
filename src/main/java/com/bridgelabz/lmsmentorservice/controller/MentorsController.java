package com.bridgelabz.lmsmentorservice.controller;

import com.bridgelabz.lmsmentorservice.dto.MentorsDTO;
import com.bridgelabz.lmsmentorservice.model.MentorsModel;
import com.bridgelabz.lmsmentorservice.service.IMentorsService;
import com.bridgelabz.lmsmentorservice.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mentors")
public class MentorsController {
    @Autowired
    IMentorsService mentorsService;

    /*
     * Purpose : Create Mentor Details
     * */
    @PostMapping("/addMentor")
    public ResponseEntity<Response> addMentor(@RequestHeader String token,@Valid @RequestBody MentorsDTO mentorsDTO) {
        Response response = mentorsService.addMentor(token, mentorsDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Add ProfilePic Url to Mentor
     * */
    @PostMapping("/addProfilePicUrl")
    public ResponseEntity<Response> addProfilePic(@RequestHeader String token, @RequestParam String profilePic, @RequestParam Long id) {
        Response response = mentorsService.addProfilePic(token, id, profilePic);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Retrieve all Metors Detailsu
     * @Param :  token
     * */
    @GetMapping("/getAllMentrs")
    public ResponseEntity<List<?>> getAllMentors(@RequestHeader String token) {
        List<MentorsModel> response = mentorsService.getAllMentors(token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Update Existing Mentor Details
     * @Param :  mentorsDTO,token and id
     * */
    @PutMapping("/updateMentorDetails/{id}")
    public ResponseEntity<Response> updateMentorDetails(@RequestHeader String token, @Valid @RequestBody MentorsDTO mentorsDTO, @PathVariable Long id) {
        Response response = mentorsService.updateMentorDetails(token, id, mentorsDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Delete Existing Mentor Details
     * @Param :  id and token
     * */
    @DeleteMapping("/deleteMentorDetails/{id}")
    public ResponseEntity<Response> deleteDetails(@RequestHeader String token, @PathVariable Long id) {
        Response response = mentorsService.deleteDetails(token, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Retrieve Particular Mentor By id
     * @Param :  id and token
     * */
    @GetMapping("/getMentorById/{id}")
    public ResponseEntity<Response> getByMentorId(@RequestHeader String token, @PathVariable Long id) {
        Response response = mentorsService.getMentorsDetailsById(token, id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


     // Purpose : Retrieve All Mentors Count
     // @Param :  token

    @GetMapping("/mentorsCont")
    public ResponseEntity<Long> mentorsCount(@RequestHeader String token) {
        Long response = mentorsService.mentorsCount(token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // Purpose : Retrieve Mentor Details By mentorRole
    //@Param :  token and mentorRole

    @GetMapping("/getMentorByRole")
    public ResponseEntity<Long> mentorRole(@RequestHeader String token,@RequestParam String mentorRole) {
        Long response = mentorsService.getMentorByRole(mentorRole,token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Without Query get Count

    @GetMapping("/getAllCount")
    public ResponseEntity<Long> getAllCount(@RequestHeader String token) {
        Long response = mentorsService.getAllCount(token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}