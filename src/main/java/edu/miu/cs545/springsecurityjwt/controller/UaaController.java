package edu.miu.cs545.springsecurityjwt.controller;

import edu.miu.cs545.springsecurityjwt.model.LoginRequest;
import edu.miu.cs545.springsecurityjwt.model.LoginResponse;
import edu.miu.cs545.springsecurityjwt.model.RefreshTokenRequest;
import edu.miu.cs545.springsecurityjwt.service.UaaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uaa")
@CrossOrigin
public class UaaController {

    private final UaaService uaaService;

    public UaaController(UaaService uaaService) {
        this.uaaService = uaaService;
    }

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        var loginResponse = uaaService.login(loginRequest);
        return ResponseEntity.ok().body(loginResponse);
    }

    @PostMapping("/refreshToken")
    public LoginResponse refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return uaaService.refreshToken(refreshTokenRequest);
    }

}