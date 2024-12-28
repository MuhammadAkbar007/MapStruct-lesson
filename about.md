# Contact
Basic Mapping
```java
    @Mapper(componentModel = "spring")
```

# User
Mapping with different names
```java
    @Mapping(target = "email", source = "emailId")
```

# Employee & Department
compositional beans && map from object to class
```java
    @Mapping(target = "department.deptName", source = "departmentName")

    @Mapper(
        componentModel = "spring",
        uses = {DepartmentMapper.class})
        @Mapping(target = "department", source = "departmentDto")

```

