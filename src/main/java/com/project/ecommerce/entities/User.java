package com.project.ecommerce.entities;


import com.project.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Email;
    private String password;
    private String name;
    private UserRole role;

    @Lob // can store large data
    @Column(columnDefinition = "longblob")
    private byte[] img;
}
