package pe.edu.senati.citas_api.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** Cada objeto es una fila de la tabla "roles" (GERENTE, TERAPISTA, ADMIN, CLIENTE, RECEPCIONISTA). */
@Entity
@Table(name = "roles")
public class Rol {

    @Id
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String nombre;

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}