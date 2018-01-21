package pl.oskarpolak.demojpa.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.oskarpolak.demojpa.models.repositories.UserRepository;

import javax.persistence.GeneratedValue;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam("login") String login,
                            @RequestParam("password") String password){
        boolean isCorrectData =
                userRepository.existsByLoginAndPassword(login, password);
        if(isCorrectData){

        }

    }

}
