package com.example.demo.crud.adapter.out.persistence;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "UsuarioSpring")
public class UserEntity {

    @Id
    @Column(name = "identificacion")
    private String id;

    @Column(name = "nombre")
    private String nombre;
}
