package co.edu.asys.biblioteca.persistecia.repositorios;

import co.edu.asys.biblioteca.persistecia.entidades.InventarioEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Long> {
}
