package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gitLoginController {

    @RequestMapping("/gitpralogin")
    public String loginPage() {
        return "gitlogin";
    }

    @PostMapping("/login")
    public String login(@RequestParam String id, @RequestParam String password, Model model) {
        // IDとパスワードの検証
        if ("gitlogin".equals(id) && "gitpw".equals(password)) {
            // ログイン成功
            return "redirect:/gittemlist";
        } else {
            // ログイン失敗
            model.addAttribute("error", "Invalid credentials");
            return "gitloginlogin";
        }
    }

 
}