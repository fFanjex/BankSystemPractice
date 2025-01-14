package ru.ffanjex.banksystem.mapper;

import org.springframework.stereotype.Component;
import ru.ffanjex.banksystem.dto.CategoryDTO;
import ru.ffanjex.banksystem.model.Category;

@Component
public class CategoryMapper {

    public CategoryDTO toCategoryDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());

        return categoryDTO;
    }

    public Category toCategoryEntity(CategoryDTO categoryDTO) {
        Category category = new Category();

        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());

        return category;
    }
}
