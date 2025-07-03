package com.spring.spring_prueba.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Administrador {

    @Id
    private long id;
    @Column(nullable = false)
    private String correo;
    @Column(nullable = false)
    private String contraseña;
}
