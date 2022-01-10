package ru.mtuci.silmpleapi1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.silmpleapi1.dao.CatsRepository;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final CatsRepository catsRepository;

    @Autowired
    public CommandLineAppStartupRunner (CatsRepository catsRepository) {
        this.catsRepository = catsRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println(catsRepository.findById(2L).get());
    }
}
