package pl.oskarpolak.demojpa.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.oskarpolak.demojpa.models.forms.RegisterForm;
import pl.oskarpolak.demojpa.models.repositories.UserRepository;
import pl.oskarpolak.demojpa.models.services.UserService;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam("login") String login,
                            @RequestParam("password") String password,
                            Model model){
        boolean isCorrectData =
                userRepository.existsByLoginAndPassword(login, password);
        if(isCorrectData){
            userService.setLogIn(true);
            userService.setLogin(login);
            return "index";
        }
        model.addAttribute("info", "Błędne dane logowania!");
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute @Valid RegisterForm form,
                               BindingResult result){
        if(result.hasErrors()){
            System.out.println("Ma błędy!!!!!!");
        }
        //zapis do bazy
        return "register";
    }

}
