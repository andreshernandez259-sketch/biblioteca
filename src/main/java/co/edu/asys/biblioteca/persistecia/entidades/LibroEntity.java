package co.edu.asys.biblioteca.persistecia.entidades;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "Libro")
@Getter
@Setter
@NoArgsConstructor
public class LibroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "id_Catgoria")
    private LibroEntity Categoria;
}
