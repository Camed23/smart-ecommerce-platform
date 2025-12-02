package com.start.ecommerce.service.impl;

import com.start.ecommerce.dto.AuthResponse;
import com.start.ecommerce.dto.LoginRequest;
import com.start.ecommerce.dto.SignupRequest;
import com.start.ecommerce.model.Role;
import com.start.ecommerce.model.User;
import com.start.ecommerce.repository.UserRepository;
import com.start.ecommerce.security.jwt.JwtService;
import com.start.ecommerce.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResponse signup(SignupRequest request) {

        // Vérification email doublon
        if (repository.findByEmail(request.email()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        User user = User.builder()
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .role(Role.USER)
                .build();

        repository.save(user);

        String token = jwtService.generateToken(user.getEmail(), user.getRole().name());

        return new AuthResponse(token);
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        // Vérifier si l’utilisateur existe
        User user = repository.findByEmail(request.email())
                .orElseThrow(() -> new BadCredentialsException("Incorrect email or password"));

        // Authentifier via Spring Security (meilleure pratique)
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.email(), request.password())
            );
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Incorrect email or password");
        }

        String token = jwtService.generateToken(user.getEmail(), user.getRole().name());

        return new AuthResponse(token);
    }
}
