package com.company.leavemanagement.leavemanagement.repository;

import com.company.leavemanagement.leavemanagement.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
