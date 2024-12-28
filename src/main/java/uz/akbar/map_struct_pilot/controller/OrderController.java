package uz.akbar.map_struct_pilot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.akbar.map_struct_pilot.payload.OrderDto;
import uz.akbar.map_struct_pilot.service.OrderService;

/** OrderController */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired OrderService service;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderDto dto) {
        return ResponseEntity.ok(service.saveOrder(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOrderById(id));
    }
}
