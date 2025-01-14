package ru.ffanjex.banksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ffanjex.banksystem.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
