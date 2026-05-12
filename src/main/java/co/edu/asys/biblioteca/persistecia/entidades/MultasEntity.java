package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Multas")
@Getter
@Setter
@NoArgsConstructor
public class MultasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_renta")
    private  MultasEntity Renta;
    private int monto;
    private String estado;
    private int fechaPagar;

}
