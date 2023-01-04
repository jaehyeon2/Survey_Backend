package com.survey_backend.repository;


import com.survey_backend.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT distinct q FROM Question q join q.itemList where q.id=:id")
    Optional<Question> findQuestionWithItemUsingJoin();
}
