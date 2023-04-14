package org.example.sweater_v1.repos;

import org.example.sweater_v1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String username);

}
