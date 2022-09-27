package renan.gatewayservice.service;

import renan.gatewayservice.model.Role;
import renan.gatewayservice.model.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}