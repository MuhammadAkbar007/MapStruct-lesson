package uz.akbar.map_struct_pilot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.akbar.map_struct_pilot.payload.UserDto;
import uz.akbar.map_struct_pilot.service.UserService;

/** UserController */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired UserService service;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UserDto dto) {
        return ResponseEntity.ok(service.saveUser(dto));
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(service.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }
}
