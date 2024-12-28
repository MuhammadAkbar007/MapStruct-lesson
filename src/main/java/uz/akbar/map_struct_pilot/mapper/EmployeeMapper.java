package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import uz.akbar.map_struct_pilot.entity.Employee;
import uz.akbar.map_struct_pilot.payload.EmployeeDto;

/** EmployeeMapper */
@Mapper(
        componentModel = "spring",
        uses = {DepartmentMapper.class})
public interface EmployeeMapper {
    @Mapping(target = "id", source = "empId")
    @Mapping(target = "name", source = "empName")
    @Mapping(target = "department", source = "departmentDto")
    // @Mapping(target = "department.deptName", source = "departmentName")
    Employee toEntity(EmployeeDto dto);

    @Mappings({ // this is another way
        @Mapping(target = "empId", source = "id"),
        @Mapping(target = "empName", source = "name"),
        @Mapping(target = "departmentDto", source = "department"),
        // @Mapping(target = "departmentName", source = "department.deptName")
    })
    EmployeeDto toDto(Employee employee);
}
