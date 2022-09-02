package kz.bitlab.bootcamp.bootcampliquibase.mapper;

import kz.bitlab.bootcamp.bootcampliquibase.dto.BrandDto;
import kz.bitlab.bootcamp.bootcampliquibase.model.Brand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BrandMapper {

    BrandDto toDto(Brand brand);
    Brand toEntity(BrandDto brandDto);

    List<BrandDto> toDtoList(List<Brand> list);
    List<Brand> toEntityList(List<BrandDto> list);

}