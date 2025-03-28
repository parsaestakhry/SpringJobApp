package com.parsa.springjobapp.service;


import com.parsa.springjobapp.model.jobPost;
import com.parsa.springjobapp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public void addJob(jobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<jobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }

}
