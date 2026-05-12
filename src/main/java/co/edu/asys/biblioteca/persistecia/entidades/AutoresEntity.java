package co.edu.asys.biblioteca.persistecia.entidades;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Autores")
@Getter
@Setter
@NoArgsConstructor
public class AutoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int edad;
    private String nombre;
    private String biografia;
}
