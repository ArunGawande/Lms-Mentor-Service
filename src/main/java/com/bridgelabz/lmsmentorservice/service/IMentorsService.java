package com.bridgelabz.lmsmentorservice.service;

import com.bridgelabz.lmsmentorservice.dto.MentorsDTO;
import com.bridgelabz.lmsmentorservice.model.MentorsModel;
import com.bridgelabz.lmsmentorservice.util.Response;

import java.util.List;

public interface IMentorsService {
    Response addMentor(String token, MentorsDTO mentorsDTO);

    Response addProfilePic(String token, Long id, String profilePic);

    List<MentorsModel> getAllMentors(String token);

    Response updateMentorDetails(String token, Long id, MentorsDTO mentorsDTO);

    Response deleteDetails(String token, Long id);

    Response getMentorsDetailsById(String token, Long id);

    Long mentorsCount(String token);

    Long getMentorByRole(String token, String s);

    Long getAllCount(String token);

}