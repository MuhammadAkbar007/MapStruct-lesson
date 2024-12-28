package uz.akbar.map_struct_pilot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uz.akbar.map_struct_pilot.entity.User;

/** UserRepository */
public interface UserRepository extends JpaRepository<User, Long> {}
