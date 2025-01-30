package com.CloudBuild.DemoCloudbuild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class CloudBuildController {

    @GetMapping("/test")
    public String test(){
        return "This is demo for CICD pipeline using CloudBuild";
    }
}
