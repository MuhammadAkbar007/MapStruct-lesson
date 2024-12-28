package uz.akbar.map_struct_pilot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.akbar.map_struct_pilot.entity.Contact;
import uz.akbar.map_struct_pilot.mapper.ContactMapper;
import uz.akbar.map_struct_pilot.payload.ContactDto;
import uz.akbar.map_struct_pilot.repository.ContactRepository;

import java.util.List;

/** ContactService */
@Service
public class ContactService {

    @Autowired ContactRepository repository;
    @Autowired ContactMapper mapper;

    public Contact saveContact(ContactDto dto) {
        // Contact contact =
        //         Contact.builder()
        //                 .firstName(dto.getFirstName())
        //                 .lastName(dto.getLastName())
        //                 .email(dto.getEmail())
        //                 .phoneNumber(dto.getPhoneNumber())
        //                 .build();
        // return repository.save(contact);

        Contact contact = mapper.toEntity(dto);
        contact.setId(null);
        return repository.save(contact);
    }

    public ContactDto getContactById(Long id) {
        // Optional<Contact> optional = repository.findById(id);
        // return optional.map(
        //                 value ->
        //                         ContactDto.builder()
        //                                 .id(id)
        //                                 .firstName(value.getFirstName())
        //                                 .lastName(value.getLastName())
        //                                 .email(value.getEmail())
        //                                 .phoneNumber(value.getPhoneNumber())
        //                                 .build())
        //         .orElse(null);
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    public List<ContactDto> getContactList() {
        // return repository.findAll().stream()
        //         .map(
        //                 contact ->
        //                         ContactDto.builder()
        //                                 .id(contact.getId())
        //                                 .firstName(contact.getFirstName())
        //                                 .lastName(contact.getLastName())
        //                                 .email(contact.getEmail())
        //                                 .phoneNumber(contact.getPhoneNumber())
        //                                 .build())
        //         .toList();
        return mapper.toDtoList(repository.findAll());
    }
}
