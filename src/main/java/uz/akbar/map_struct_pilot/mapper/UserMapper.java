package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import uz.akbar.map_struct_pilot.entity.User;
import uz.akbar.map_struct_pilot.payload.UserDto;

import java.util.List;

/** UserMapper */
@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "email", source = "emailId")
    @Mapping(target = "phoneNumber", source = "contactNumber")
    User toEntity(UserDto dto);

    @Mapping(target = "emailId", source = "email")
    @Mapping(target = "contactNumber", source = "phoneNumber")
    UserDto toDto(User user);

    List<UserDto> toDtoList(List<User> users);
}
