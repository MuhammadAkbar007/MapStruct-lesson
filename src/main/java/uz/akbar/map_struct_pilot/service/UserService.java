package uz.akbar.map_struct_pilot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.akbar.map_struct_pilot.entity.User;
import uz.akbar.map_struct_pilot.mapper.UserMapper;
import uz.akbar.map_struct_pilot.payload.UserDto;
import uz.akbar.map_struct_pilot.repository.UserRepository;

import java.util.List;

/** UserService */
@Service
public class UserService {

    @Autowired UserRepository repository;
    @Autowired UserMapper mapper;

    public User saveUser(UserDto dto) {
        User user = mapper.toEntity(dto);
        return repository.save(user);
    }

    public UserDto getUserById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(new UserDto());
    }

    public List<UserDto> getUsers() {
        return mapper.toDtoList(repository.findAll());
    }
}
