package com.bridgelabz.lmsmentorservice.repository;

import com.bridgelabz.lmsmentorservice.model.MentorsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MentorsRepository extends JpaRepository<MentorsModel, Long> {
    @Query(value = "select count(id) from mentors", nativeQuery = true)
    Long mentorsCount();

    @Query(value = "select count(mentor_role) from mentors where mentor_role=:isMentorRole", nativeQuery = true)
    Long mentorsCountByRole(@Param("isMentorRole") String mentorRole);

}