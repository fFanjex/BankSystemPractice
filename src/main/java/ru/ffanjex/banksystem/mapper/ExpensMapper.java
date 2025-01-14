package ru.ffanjex.banksystem.mapper;

import org.springframework.stereotype.Component;
import ru.ffanjex.banksystem.dto.ExpensDTO;
import ru.ffanjex.banksystem.model.Expens;
import ru.ffanjex.banksystem.model.User;

@Component
public class ExpensMapper {

    public ExpensDTO toExpensDTO(Expens expens) {
        ExpensDTO expensDTO = new ExpensDTO();

        expensDTO.setId(expens.getId());
        expensDTO.setDescription(expens.getDescription());
        expensDTO.setAmount(expens.getAmount());
        expensDTO.setCategory(expens.getCategory());
        expensDTO.setDate(expens.getDate());
        expensDTO.setUserId(expens.getUser().getId());

        return expensDTO;
    }

    public Expens toExpensEntity(ExpensDTO expensDTO) {
        Expens expens = new Expens();

        expens.setId(expensDTO.getId());
        expens.setDescription(expensDTO.getDescription());
        expens.setAmount(expensDTO.getAmount());
        expens.setCategory(expensDTO.getCategory());
        expens.setDate(expensDTO.getDate());

        User user = new User();
        user.setId(expensDTO.getUserId());
        expens.setUser(user);

        return expens;
    }
}
