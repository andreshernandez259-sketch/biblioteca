package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.ReseñasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReseñasRepository extends JpaRepository<ReseñasEntity, Long> {
}
