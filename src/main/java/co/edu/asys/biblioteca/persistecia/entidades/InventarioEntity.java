package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Inventario")
@Getter
@Setter
@NoArgsConstructor

public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int existencias;
    @ManyToOne
    @JoinColumn(name = "id_Categoria")
    private InventarioEntity Categoria;
}
