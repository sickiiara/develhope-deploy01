package co.develhope.deploy01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    @Value("${myCustomVarTree.customDevName}")
    String customDevName;

    @GetMapping("/customDevName")
    public String devName(){
        return environment.getProperty("myCustomVarTree.devName");
    }


}

