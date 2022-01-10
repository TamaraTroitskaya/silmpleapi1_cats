package ru.mtuci.silmpleapi1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtuci.silmpleapi1.model.Cats;

@Transactional(readOnly = true)
public interface CatsRepository extends JpaRepository<Cats,Long> {
    @Transactional
    @Modifying
    @Query ("DELETE FROM Cats p WHERE p.id=:id")
    int delete (@Param("id") Long id);
}
