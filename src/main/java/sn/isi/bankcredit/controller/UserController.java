package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/users-list")
    public String list() {
        return "users/usersList";
    }

    @GetMapping("/add-user")
    public String add() {
        return "users/addUser";
    }
}