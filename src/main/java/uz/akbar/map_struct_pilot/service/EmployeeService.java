package uz.akbar.map_struct_pilot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.akbar.map_struct_pilot.entity.Employee;
import uz.akbar.map_struct_pilot.mapper.EmployeeDetailsMapper;
import uz.akbar.map_struct_pilot.mapper.EmployeeMapper;
import uz.akbar.map_struct_pilot.payload.EmployeeDetailsDto;
import uz.akbar.map_struct_pilot.payload.EmployeeDto;
import uz.akbar.map_struct_pilot.repository.EmployeeRepository;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Autowired
    EmployeeMapper mapper;
    @Autowired
    EmployeeDetailsMapper employeeDetailsMapper;

    public Employee saveEmployee(EmployeeDto dto) {
        return repository.save(mapper.toEntity(dto));
    }

    public EmployeeDto getEmployeeById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(new EmployeeDto());
    }

    public EmployeeDetailsDto getEmployeeDetails(Long id) {
        return repository.findById(id)
                .map(employee -> employeeDetailsMapper.toEmployeeDetailsDto(employee, employee.getDepartment()))
                .orElse(new EmployeeDetailsDto());
    }
}
