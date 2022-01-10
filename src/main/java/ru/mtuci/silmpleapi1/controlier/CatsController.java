package ru.mtuci.silmpleapi1.controlier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.silmpleapi1.model.Cats;
import ru.mtuci.silmpleapi1.service.CatsService;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = CatsController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class CatsController {
    public static final String REST_URL = "/api/v1/cats";

    private CatsService catsService;

    @Autowired
    public CatsController (CatsService catsService) {
        this.catsService = catsService;
    }

    @GetMapping(value = "/{id}")
    public Cats get(@PathVariable("id") Long id) {
        log.info("get" + id);
        return catsService.get(id);
}

    @GetMapping
    public List<Cats> getAll() {
        log.info("getAll");
        return catsService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cats save(@RequestBody Cats cats) {
        log.info("save" + cats);
        return catsService.save(cats);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        log.info("delete" + id);
        catsService.delete(id);
    }
}
