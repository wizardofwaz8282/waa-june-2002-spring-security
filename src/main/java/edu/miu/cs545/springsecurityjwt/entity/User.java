package edu.miu.cs545.springsecurityjwt.entity;

import edu.miu.cs545.springsecurityjwt.entity.Address;
import edu.miu.cs545.springsecurityjwt.entity.Review;
import edu.miu.cs545.springsecurityjwt.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<Role> roles;


    @Embedded
    private Address address;
    @OneToMany(mappedBy = "userId",cascade = CascadeType.ALL)
    private List<Review> reviews;


}
