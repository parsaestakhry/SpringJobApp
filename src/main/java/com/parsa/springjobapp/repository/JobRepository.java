package com.parsa.springjobapp.repository;

import com.parsa.springjobapp.model.jobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<jobPost> jobs = new ArrayList<>(Arrays.asList(
            new jobPost(1, "Java Developer", "Java Developer with 2 years of experience", 2, Arrays.asList("Java", "Spring Boot", "Hibernate")),
            new jobPost(2, "Python Developer", "Python Developer with 2 years of experience", 2, Arrays.asList("Python", "Django", "Flask")),
            new jobPost(3, "React Developer", "React Developer with 2 years of experience", 2, Arrays.asList("React", "Redux", "Javascript")),
            new jobPost(4, "Angular Developer", "Angular Developer with 2 years of experience", 2, Arrays.asList("Angular", "Typescript", "Javascript")),
            new jobPost(5, "Node Developer", "Node Developer with 2 years of experience", 2, Arrays.asList("Node", "Express", "Javascript")),
            new jobPost(6, "Vue Developer", "Vue Developer with 2 years of experience", 2, Arrays.asList("Vue", "Vuex", "Javascript")),
            new jobPost(7, "Ruby Developer", "Ruby Developer with 2 years of experience", 2, Arrays.asList("Ruby", "Rails", "Javascript")),
            new jobPost(8, "PHP Developer", "PHP Developer with 2 years of experience", 2, Arrays.asList("PHP", "Laravel", "Javascript")),
            new jobPost(9, "C# Developer", "C# Developer with 2 years of experience", 2, Arrays.asList("C#", ".NET", "Javascript")),
            new jobPost(10, "C++ Developer", "C++ Developer with 2 years of experience", 2, Arrays.asList("C++", "QT", "Javascript"))
    ));

    public List<jobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(jobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
