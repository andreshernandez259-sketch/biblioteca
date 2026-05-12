package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Turnos")
@Getter
@Setter
@NoArgsConstructor
public class TurnosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private  TurnosEntity Empleado;
    private int dia;
    private int horaEntrada;
    private int horaSalida;
}
