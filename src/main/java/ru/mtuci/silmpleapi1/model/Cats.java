package ru.mtuci.silmpleapi1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class  Cats extends AbstractBaseEntity {
    @NotBlank
    private String name;
    @NotBlank
    private String breed;
    @NotNull
    private Integer age;
    @NotNull
    private String owner;
}





