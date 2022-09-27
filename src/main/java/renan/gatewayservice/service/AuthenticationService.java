package renan.gatewayservice.service;

import renan.gatewayservice.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}