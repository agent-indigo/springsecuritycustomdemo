package com.keyin.hynes.braden.spring.security.custom.demo.interfaces.repositories;
import com.keyin.hynes.braden.spring.security.custom.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
  UserEntity findByUsername(String username);
}