package com.company.leavemanagement.leavemanagement.model.dto;

import com.company.leavemanagement.leavemanagement.util.Role;
import lombok.Data;


@Data
public class UserDTO {
    private long id;
    private String name;
    private String email;
    private String password;
    private Role role;

}
