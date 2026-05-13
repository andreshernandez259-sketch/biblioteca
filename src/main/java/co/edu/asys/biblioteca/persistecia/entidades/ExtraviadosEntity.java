package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Extraviados")
@Getter
@Setter
@NoArgsConstructor
public class ExtraviadosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_libro")
    private  LibroEntity Libro;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuario;



    private  ExtraviadosEntity Usuario;
    private int fechaReporte;

}
