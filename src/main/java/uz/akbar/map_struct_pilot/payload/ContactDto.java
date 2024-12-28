package uz.akbar.map_struct_pilot.payload;

import lombok.Builder;
import lombok.Data;

/** ContactDto */
@Data
@Builder
public class ContactDto {

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;
}
