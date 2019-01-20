package com.feea.moviereview.controller;

import com.feea.moviereview.dto.UserDTO;
import com.feea.moviereview.entity.User;
import com.feea.moviereview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/register")
    public String register(@ModelAttribute("userDTO")UserDTO userDTO){
        User user = new User(userDTO);
        System.out.println("Registering user: "+userDTO.getUsername());
        userRepository.save(user);
        return "redirect:/movies/all";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("userDTO") UserDTO userDTO) {
        User user = userRepository.findByUsernameAndPassword(userDTO.getUsername(),userDTO.getPassword());
        if(user != null)
            return "redirect:/movies/all";
        return String.valueOf(HttpStatus.FORBIDDEN);
    }
}
