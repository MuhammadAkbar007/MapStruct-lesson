package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;

import uz.akbar.map_struct_pilot.entity.Contact;
import uz.akbar.map_struct_pilot.payload.ContactDto;

import java.util.List;

/** ContactMapper */
@Mapper(componentModel = "spring")
public interface ContactMapper {

    Contact toEntity(ContactDto dto);

    ContactDto toDto(Contact contact);

    List<ContactDto> toDtoList(List<Contact> contacts);
}
