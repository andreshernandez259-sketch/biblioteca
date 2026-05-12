package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Reseñas")
@Getter
@Setter
@NoArgsConstructor
public class ReseñasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private ReseñasEntity usuario;
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private ReseñasEntity Libro;
    private int puntuacion;
}
