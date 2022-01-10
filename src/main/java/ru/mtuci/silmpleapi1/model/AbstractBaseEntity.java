package ru.mtuci.silmpleapi1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Access(AccessType.FIELD)
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class AbstractBaseEntity {
    public static final int START_SEQ = 1;

    @Id
    @SequenceGenerator(name="global_seq1", sequenceName = "global_seq1", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq1")
    private Long id;
}
