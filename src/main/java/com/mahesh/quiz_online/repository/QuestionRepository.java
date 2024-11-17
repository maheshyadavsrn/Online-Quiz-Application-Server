package com.mahesh.quiz_online.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mahesh.quiz_online.model.Question;

public interface  QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT DISTINCT q.subject FROM Question q")
    List<String> findDistinctSubject();
    Page<Question> findBySubject(String subject, Pageable pageable);
    
}
