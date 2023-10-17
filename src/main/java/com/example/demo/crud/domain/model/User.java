package com.example.demo.crud.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    public String  id;
    public String nombre;

    public User() {
    }

}
