package Empresa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Basic
    private String numeroTelefono;
    @Basic
    private String nombre;
    @Basic
    private String apellido;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Cliente(){

    }
    public Cliente(String numeroTelefono, String nombre, String apellido,Long id) {
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
