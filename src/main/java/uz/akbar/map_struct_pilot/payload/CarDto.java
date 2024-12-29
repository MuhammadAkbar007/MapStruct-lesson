package uz.akbar.map_struct_pilot.payload;

import lombok.Data;

import uz.akbar.map_struct_pilot.enums.FuelType;

/** CarDto */
@Data
public class CarDto {
    private int id;
    private String name;
    private FuelType fuelType;
}
