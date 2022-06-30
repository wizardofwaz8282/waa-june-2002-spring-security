package edu.miu.cs545.springsecurityjwt.dto;

import edu.miu.cs545.springsecurityjwt.entity.Address;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDto implements Serializable {
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Address address;
}
