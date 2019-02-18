package br.com.springboot.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	UsuarioEntity findByCodigo(Long codigoUsuario);
	
	UsuarioEntity findByLogin(String login);

	
}
