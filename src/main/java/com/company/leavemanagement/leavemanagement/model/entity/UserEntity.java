package com.company.leavemanagement.leavemanagement.model.entity;

import com.company.leavemanagement.leavemanagement.util.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String password;
    private Role role;
}
