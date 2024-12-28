package uz.akbar.map_struct_pilot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import uz.akbar.map_struct_pilot.entity.Order;
import uz.akbar.map_struct_pilot.payload.OrderDto;

/** OrderMapper */
@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "amount", source = "orderAmount")
    @Mapping(target = "date", source = "orderDate", dateFormat = "dd-MM-yyyy")
    Order toEntity(OrderDto dto);

    @Mapping(target = "orderAmount", source = "amount")
    @Mapping(target = "orderDate", source = "date", dateFormat = "dd-MM-yyyy")
    OrderDto toDto(Order order);
}
