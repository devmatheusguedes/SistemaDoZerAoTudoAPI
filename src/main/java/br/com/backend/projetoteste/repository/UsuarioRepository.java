package br.com.backend.projetoteste.repository;

import br.com.backend.projetoteste.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
