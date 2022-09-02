package kz.bitlab.bootcamp.bootcampliquibase.api;

import kz.bitlab.bootcamp.bootcampliquibase.dto.ItemDto;
import kz.bitlab.bootcamp.bootcampliquibase.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDto> getItems(){
        return itemService.getItems();
    }

}
