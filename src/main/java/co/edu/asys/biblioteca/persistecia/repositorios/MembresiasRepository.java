package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.MembresiasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembresiasRepository extends JpaRepository<MembresiasEntity, Long> {
}
