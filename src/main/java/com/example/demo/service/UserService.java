package com.example.demo.service;

import com.example.demo.repository.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<User> helloWorld() {
        return List.of(
                new User(1L, "Iakov Lysenko", "lysenko_iakov@yahoo.com",LocalDate.of(2000, 4, 26), 24),
                new User(2L, "Alena Lysenko", "egorova_alyyona@mail.ru", LocalDate.of(2003, 4, 12), 22),
                new User(3L, "Maria Lysenko", "masha_lps@gmail.com", LocalDate.of(2006, 6, 28), 18)
        );
    }

}
