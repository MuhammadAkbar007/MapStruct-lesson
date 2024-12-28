package uz.akbar.map_struct_pilot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.akbar.map_struct_pilot.payload.EmployeeDto;
import uz.akbar.map_struct_pilot.service.EmployeeService;

/** EmployeeController */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired EmployeeService service;

    @PostMapping
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDto dto) {
        return ResponseEntity.ok(service.saveEmployee(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @GetMapping("/employee-details/{id}")
    public ResponseEntity<?> getEmployeeDetails(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEmployeeDetails(id));
    }
}
