package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;

import uz.akbar.map_struct_pilot.entity.Department;
import uz.akbar.map_struct_pilot.payload.DepartmentDto;

/** DepartmentMapper */
@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department toEntity(DepartmentDto dto);

    DepartmentDto toDto(Department department);
}
