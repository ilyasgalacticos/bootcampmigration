package kz.bitlab.bootcamp.bootcampliquibase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String name;
    private int amount;
    private int price;
    private String description;
    private BrandDto brand;
}