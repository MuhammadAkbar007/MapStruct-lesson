package uz.akbar.map_struct_pilot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.akbar.map_struct_pilot.entity.Order;
import uz.akbar.map_struct_pilot.mapper.OrderMapper;
import uz.akbar.map_struct_pilot.payload.OrderDto;
import uz.akbar.map_struct_pilot.repository.OrderRepository;

/** OrderService */
@Service
public class OrderService {

    @Autowired OrderRepository repository;
    @Autowired OrderMapper mapper;

    public Order saveOrder(OrderDto dto) {
        return repository.save(mapper.toEntity(dto));
    }

    public OrderDto getOrderById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(new OrderDto());
    }
}
