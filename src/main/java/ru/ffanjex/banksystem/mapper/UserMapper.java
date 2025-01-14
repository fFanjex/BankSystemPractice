package ru.ffanjex.banksystem.mapper;

import org.springframework.stereotype.Component;
import ru.ffanjex.banksystem.dto.UserDTO;
import ru.ffanjex.banksystem.model.User;

@Component
public class UserMapper {

    public UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(userDTO.getEmail());

        return userDTO;
    }

    public User toUserEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
