package com.avanade.security.securityapp.repository;

import com.avanade.security.securityapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UserModel, String> {
}
