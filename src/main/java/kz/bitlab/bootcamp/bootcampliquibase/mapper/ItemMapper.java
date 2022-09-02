package kz.bitlab.bootcamp.bootcampliquibase.mapper;

import kz.bitlab.bootcamp.bootcampliquibase.dto.ItemDto;
import kz.bitlab.bootcamp.bootcampliquibase.model.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto toDto(Item item);
    Item toEntity(ItemDto itemDto);

    List<ItemDto> toDtoList(List<Item> list);
    List<Item> toEntityList(List<ItemDto> list);

}
