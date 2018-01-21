package pl.oskarpolak.demojpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.demojpa.models.UserModel;
import pl.oskarpolak.demojpa.models.repositories.UserRepository;

@Controller
public class MainController {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        UserModel model = new UserModel();
               model.setLogin("znaszejappki");
               model.setName("Appkowa Appka");
               model.setPassword("tajnehaslo123");

        userRepository.save(model);
        return "Utworzyłem nowy rekord w bazie";
    }



}



