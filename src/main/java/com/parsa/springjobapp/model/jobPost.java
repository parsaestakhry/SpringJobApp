package com.parsa.springjobapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


//lombok reduces the amount of lines of code
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class jobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;



}
