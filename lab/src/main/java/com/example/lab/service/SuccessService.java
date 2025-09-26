package com.example.lab.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class SuccessService {

    public static LocalDateTime getCurrentDT() {
        return LocalDateTime.now();
    }
}
