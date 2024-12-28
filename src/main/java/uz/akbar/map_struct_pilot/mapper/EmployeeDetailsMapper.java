package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import uz.akbar.map_struct_pilot.entity.Department;
import uz.akbar.map_struct_pilot.entity.Employee;
import uz.akbar.map_struct_pilot.payload.EmployeeDetailsDto;

/** EmployeeDtailsMapper */
@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {

    @Mappings({
        @Mapping(target = "empId", source = "employee.id"),
        @Mapping(target = "empName", source = "employee.name"),
        @Mapping(target = "deptName", source = "department.deptName"),
        @Mapping(target = "deptId", source = "department.id")
    })
    EmployeeDetailsDto toEmployeeDetailsDto(Employee employee, Department department);
}
