package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // 1. Shows a basic HTML form when you visit the page
    @GetMapping("/")
    @ResponseBody
    public String showForm() {
        return "<html><head>" +
                "<link rel='stylesheet' type='text/css' href='/style.css'>" +
                "</head><body>" +
                "<div class='form-card'>" +
                "  <h2>Create Account</h2>" +
                "  <form action='/submit' method='POST'>" +
                "    <div class='input-group'>" +
                "      <label>Username</label>" +
                "      <input type='text' name='username' placeholder='Enter username' required/>" +
                "    </div>" +
                "    <div class='input-group'>" +
                "      <label>Email Address</label>" +
                "      <input type='email' name='email' placeholder='name@example.com' required/>" +
                "    </div>" +
                "    <button type='submit'>Submit</button>" +
                "  </form>" +
                "</div>" +
                "</body></html>";
    }
    // 2. Catches the submitted data and saves it to MySQL
    @PostMapping("/submit")
    @ResponseBody
    public String handleForm(@RequestParam String username, @RequestParam String email) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);

        userRepository.save(user); // Saves to MySQL!

        return "<h3>Success! Data saved to the database. <a href='/'>Go back</a></h3>";
    }
}