package edu.miu.cs545.springsecurityjwt.service;

import edu.miu.cs545.springsecurityjwt.model.LoginRequest;
import edu.miu.cs545.springsecurityjwt.model.LoginResponse;
import edu.miu.cs545.springsecurityjwt.model.RefreshTokenRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
