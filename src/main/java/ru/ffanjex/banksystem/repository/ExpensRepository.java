package ru.ffanjex.banksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ffanjex.banksystem.model.Expens;

@Repository
public interface ExpensRepository extends JpaRepository<Expens, Integer> {
}
