package kz.bitlab.bootcamp.bootcampliquibase.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_brands")
@Getter
@Setter
public class Brand extends BaseEntity{

    @Column(name = "name")
    private String name;

}
