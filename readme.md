# MapStruct 🗺  + Spring Boot 🌱 learning project

## Contact class
**Basic** Mapping
```java
    @Mapper(componentModel = "spring")
```

## User class
Mapping with **different names**
```java
    @Mapping(target = "email", source = "emailId")
```

## Employee & Department classes
**compositional beans** && map from object to class
```java
    @Mapping(target = "department.deptName", source = "departmentName")

    @Mapper(
        componentModel = "spring",
        uses = {DepartmentMapper.class})

        @Mapping(target = "department", source = "departmentDto")

```

## Car, BioDieselCar && ElectricCar classes
customize mapper with **abstract** class
**Before Mapping** and **After Mapping** conditions
**@MappingTarget** is used with **@BeforeMapping** or **@AfterMapping**
```java
@Mapper
public abstract class CarsMapper {
    @BeforeMapping
    protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDto) {
        if (car instanceof ElectricCar) {
            carDto.setFuelType(FuelType.ELECTRIC);
        }
        if (car instanceof BioDieselCar) { 
            carDto.setFuelType(FuelType.BIO_DIESEL);
        }
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDTO carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    public abstract CarDTO toCarDto(Car car);
}
```

