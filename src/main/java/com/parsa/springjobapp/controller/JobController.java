package com.parsa.springjobapp.controller;


import com.parsa.springjobapp.model.jobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JobController {
    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob(){
        return "addjob";
    }


    @RequestMapping(value = "/handleForm", method = RequestMethod.POST)
    public String handleForm(jobPost jobPost){
        return "success";
    }
}
