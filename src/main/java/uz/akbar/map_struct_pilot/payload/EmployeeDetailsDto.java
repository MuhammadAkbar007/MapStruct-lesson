package uz.akbar.map_struct_pilot.payload;

import lombok.Data;

/** EmployeeDetailsDto */
@Data
public class EmployeeDetailsDto {
    private Long empId;
    private String empName;
    private String email;
    private float salary;
    private String deptId;
    private String deptName;
}
