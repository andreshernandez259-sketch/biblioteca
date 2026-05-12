package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Salas")
@Getter
@Setter
@NoArgsConstructor
public class ReservaSalasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private  ReservaSalasEntity Empleado;
    @ManyToOne
    @JoinColumn(name = "id_sala")
    private  ReservaSalasEntity salas;
    private int horaInicio;
    private int horaFin;
    private int fecha;
}
