package co.edu.asys.biblioteca.persistecia.entidades;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Venta")
@Getter
@Setter
@NoArgsConstructor
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal precio;
    @ManyToOne
    @JoinColumn(name = "id_Libro")
    private VentaEntity Libro;
    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private VentaEntity Usuario;
}