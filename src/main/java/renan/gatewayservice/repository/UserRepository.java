package renan.gatewayservice.repository;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import renan.gatewayservice.model.Role;
import renan.gatewayservice.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>
{
    //findBy+fieldName
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}