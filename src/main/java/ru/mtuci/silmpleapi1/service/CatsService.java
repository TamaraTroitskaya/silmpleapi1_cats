package ru.mtuci.silmpleapi1.service;

import ru.mtuci.silmpleapi1.model.Cats;
import java.util.List;

public interface CatsService {
    Cats get (Long id);

    List<Cats> getAll();

    Cats save(Cats cats);

    void delete(Long id);
}
