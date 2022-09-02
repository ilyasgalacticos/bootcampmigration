package kz.bitlab.bootcamp.bootcampliquibase.service.impl;

import kz.bitlab.bootcamp.bootcampliquibase.dto.ItemDto;
import kz.bitlab.bootcamp.bootcampliquibase.mapper.ItemMapper;
import kz.bitlab.bootcamp.bootcampliquibase.repository.ItemRepository;
import kz.bitlab.bootcamp.bootcampliquibase.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> getItems() {
        return itemMapper.toDtoList(itemRepository.findAll());
    }
}
