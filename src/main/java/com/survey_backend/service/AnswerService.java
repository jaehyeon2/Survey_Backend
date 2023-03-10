package com.survey_backend.service;

import com.survey_backend.domain.Answer;

import com.survey_backend.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AnswerService {
    final AnswerRepository answerRepository;

    public Answer saveAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public List<Answer> findAnswerBySurveyId(String survey_hash){
        return answerRepository.findAnswerBySurvey_hash(survey_hash);
    }

    public void deleteAnswersBySurveyId(Long survey_id){
        answerRepository.deleteAnswersBySurvey_id(survey_id);
    }

    public void deleteAnswersByMemberNick(String nickname){
        answerRepository.deleteAnswersByMember_nick(nickname);
    }
}
