package ru.ffanjex.banksystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.ffanjex.banksystem.dto.UserDTO;
import ru.ffanjex.banksystem.mapper.UserMapper;
import ru.ffanjex.banksystem.model.User;
import ru.ffanjex.banksystem.repository.UserRepository;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("Пользователь с такими именем: " + username +
                    " не найден");
        }

        User user = optionalUser.get();
        UserDTO userDTO = userMapper.toUserDTO(user);

        return org.springframework.security.core.userdetails.User.builder()
                .username(userDTO.getUsername())
                .password(user.getPassword())
                .roles("USER")
                .build();
    }
}