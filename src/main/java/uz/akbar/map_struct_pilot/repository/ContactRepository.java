package uz.akbar.map_struct_pilot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uz.akbar.map_struct_pilot.entity.Contact;

/** ContactRepository */
public interface ContactRepository extends JpaRepository<Contact, Long> {}
