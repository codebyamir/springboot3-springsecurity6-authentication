package com.example.demo.service.email;

public interface EmailService {
    void sendPasswordResetEmail(String email);
    void sendVerificationEmail(String email);
}

