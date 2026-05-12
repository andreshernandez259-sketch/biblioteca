package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.ReservaSalasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaSalasRepository extends JpaRepository<ReservaSalasEntity, Long> {
}
