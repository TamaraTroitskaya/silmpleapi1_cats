package ru.mtuci.silmpleapi1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.silmpleapi1.dao.CatsRepository;
import ru.mtuci.silmpleapi1.model.Cats;
import java.util.List;

@Service
public class CatsServiceImpl implements CatsService {

    private final CatsRepository catsRepository;

    @Autowired
    public CatsServiceImpl (CatsRepository catsRepository){
        this.catsRepository = catsRepository;
    }

        @Override
    public Cats get(Long id) {
        return catsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cats> getAll() {
        return catsRepository.findAll();
    }

    @Override
    public Cats save(Cats cats) {
        return catsRepository.save(cats);
    }

    @Override
    public void delete(Long id) {
        catsRepository.delete(id);
         }
}
