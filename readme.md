# MapStruct 🗺  + Spring Boot 🌱 learning project

## Contact class
Basic Mapping
```java
    @Mapper(componentModel = "spring")
```

## User class
Mapping with different names
```java
    @Mapping(target = "email", source = "emailId")
```

## Employee & Department classes
compositional beans && map from object to class
```java
    @Mapping(target = "department.deptName", source = "departmentName")

    @Mapper(
        componentModel = "spring",
        uses = {DepartmentMapper.class})

        @Mapping(target = "department", source = "departmentDto")

```

