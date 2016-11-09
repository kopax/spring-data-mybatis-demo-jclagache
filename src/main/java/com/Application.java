package com;

import com.domain.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.ManagerService;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private ManagerService managerService;

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @RequestMapping("/manager")
    public ResponseEntity<List<Manager>> dataSource(){
        List<Manager> managerList = managerService.findAll();
        return new ResponseEntity<List<Manager>>(managerList, HttpStatus.OK);
    }

}
