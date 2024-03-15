package com.shoesstore.shoesstore.controller;

import com.shoesstore.shoesstore.entity.Users;
import com.shoesstore.shoesstore.repository.UserRepository;
import com.shoesstore.shoesstore.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new Users());
        return "/Page/Views/Authentication/login";
    }

    @RequestMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new Users());
        return "/Page/Views/Authentication/register";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Users user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String checkUser(@RequestParam String username, @RequestParam String password) {
        Users user = userRepository.findByUsernameAndPassword(username, password);
        if (user == null) {
            return "redirect:/login";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "logout")
    public String logOut(Users user) {
        return "/Page/Views/Authentication/login";
    }
}
