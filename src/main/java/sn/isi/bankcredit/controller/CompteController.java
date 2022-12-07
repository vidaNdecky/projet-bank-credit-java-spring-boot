package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comptes")
public class CompteController {
    @GetMapping("/comptes-list")
    public String list() {
        return "comptes/comptesList";
    }

    @GetMapping("/add-compte")
    public String add() {
        return "comptes/addCompte";
    }
}