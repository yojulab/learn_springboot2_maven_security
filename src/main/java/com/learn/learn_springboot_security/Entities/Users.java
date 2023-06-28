package com.learn.learn_springboot_security.Entities;

// refer from https://www.javatpoint.com/spring-boot-starter-data-jpa
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userdata")
@Getter
@Setter
@Data
public class Users {
    @Id
    private String id;
    private String username;
}
