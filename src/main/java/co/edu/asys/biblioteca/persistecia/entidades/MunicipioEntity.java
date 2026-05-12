package co.edu.asys.biblioteca.persistecia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Municipio")
@Getter
@Setter
@NoArgsConstructor

public class MunicipioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int condigo_postal;
    @ManyToOne
    @JoinColumn(name = "id_Pais")
    private MunicipioEntity Pais;

}
