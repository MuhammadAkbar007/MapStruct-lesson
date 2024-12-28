package uz.akbar.map_struct_pilot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.akbar.map_struct_pilot.payload.ContactDto;
import uz.akbar.map_struct_pilot.service.ContactService;

/** ContactController */
@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    @Autowired ContactService service;

    @PostMapping
    public ResponseEntity<?> saveContact(@RequestBody ContactDto dto) {
        return ResponseEntity.ok(service.saveContact(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getContactById(id));
    }

    @GetMapping
    public ResponseEntity<?> getContacts() {
        return ResponseEntity.ok(service.getContactList());
    }
}
