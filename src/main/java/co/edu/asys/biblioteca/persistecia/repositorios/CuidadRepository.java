package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.AutoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadRepository extends JpaRepository<AutoresEntity, Long> {
}
