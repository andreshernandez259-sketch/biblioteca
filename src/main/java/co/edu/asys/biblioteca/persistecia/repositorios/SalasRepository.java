package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.SalasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalasRepository extends JpaRepository<SalasEntity, Long> {
}
