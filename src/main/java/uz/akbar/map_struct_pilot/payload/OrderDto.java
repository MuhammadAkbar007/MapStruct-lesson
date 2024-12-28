package uz.akbar.map_struct_pilot.payload;

import lombok.Data;

/** OrderDto */
@Data
public class OrderDto {
    private Long id;
    private String orderAmount;
    private String description;
    private String orderDate;
}
