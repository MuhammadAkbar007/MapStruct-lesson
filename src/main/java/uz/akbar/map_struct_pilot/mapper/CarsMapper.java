package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import uz.akbar.map_struct_pilot.entity.BioDieselCar;
import uz.akbar.map_struct_pilot.entity.Car;
import uz.akbar.map_struct_pilot.entity.ElectricCar;
import uz.akbar.map_struct_pilot.enums.FuelType;
import uz.akbar.map_struct_pilot.payload.CarDto;

/** CarsMapper */
@Mapper
public abstract class CarsMapper {

    @BeforeMapping
    protected void enrichDtoWithFuelType(Car car, @MappingTarget CarDto dto) {
        if (car instanceof ElectricCar) {
            dto.setFuelType(FuelType.ELECTRIC);
        }

        if (car instanceof BioDieselCar) {
            dto.setFuelType(FuelType.BIO_DIESEL);
        }
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDto dto) {
        dto.setName(dto.getName().toUpperCase());
    }

    public abstract CarDto toCarDto(Car car);
}
