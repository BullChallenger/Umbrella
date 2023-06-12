package com.umbrella.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByNickName(String nickName);

    boolean existsByEmail(String email);

    Optional<User> findByRefreshToken(String refreshToken);

    Optional<User> findByEmailOrNickName(String email, String nickName);
}
