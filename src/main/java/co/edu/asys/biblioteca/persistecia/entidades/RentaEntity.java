package co.edu.asys.biblioteca.persistecia.entidades;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Renta")
@Getter
@Setter
@NoArgsConstructor
public class RentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha_renta;
    private LocalDate fecha_entrga;
    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private RentaEntity Usuario;
}
