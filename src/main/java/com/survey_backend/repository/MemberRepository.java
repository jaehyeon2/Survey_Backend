package com.survey_backend.repository;

import com.survey_backend.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByEmail(String email);

    Member findByNickname(String nickname);

//    @Query("SELECT distinct m FROM Member m join m.surveyList where m.nickname=:nickname")
//    Optional<Member> findMemberWithSurveyUsingJoin();
//
//    @Query("SELECT distinct m FROM Member m join m.answerList where m.nickname=:nickname")
//    Optional<Member> findMemberWithAnswerUsingJoin();


}
