package uz.akbar.map_struct_pilot.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** EmployeeDto */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private Long empId;
    private String empName;
    private String email;
    private float salary;
    // private String departmentName;
    private DepartmentDto departmentDto;
}
