package com.mahesh.quiz_online.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String question;

    @NotBlank
    private String subject;
 
    @NotBlank
    private String questionType;

   
    @ElementCollection
    private List<String> choices;

 
    @ElementCollection
    private List<String> correctAnswers;
}
