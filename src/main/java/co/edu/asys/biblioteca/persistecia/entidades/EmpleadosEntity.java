package co.edu.asys.biblioteca.persistecia.entidades;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "Empleados")
@Getter
@Setter
@NoArgsConstructor
public class EmpleadosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cedula;
    private int edad;
}

