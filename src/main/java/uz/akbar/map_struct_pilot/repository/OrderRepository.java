package uz.akbar.map_struct_pilot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uz.akbar.map_struct_pilot.entity.Order;

/** OrderRepository */
public interface OrderRepository extends JpaRepository<Order, Long> {}
