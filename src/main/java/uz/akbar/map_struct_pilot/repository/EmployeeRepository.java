package uz.akbar.map_struct_pilot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uz.akbar.map_struct_pilot.entity.Employee;

/** EmployeeRepository */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
