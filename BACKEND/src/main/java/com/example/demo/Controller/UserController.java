package com.example.demo.Controller;

import com.example.demo.DTO.BookDTO;
import com.example.demo.DTO.UserDTO;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUser/{id}")
    public UserDTO getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @GetMapping("/getAllUsers")
    public Set<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        return userService.deleteUser(id);
    }

    @GetMapping("/{id}/booksOwned")
    public Set<BookDTO> getBooksOwnedById(@PathVariable int id){
        return userService.getBooksOwnedById(id);
    }
}
