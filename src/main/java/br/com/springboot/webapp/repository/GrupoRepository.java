package br.com.springboot.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.webapp.entity.GrupoEntity;
import br.com.springboot.webapp.entity.UsuarioEntity;

public interface GrupoRepository extends JpaRepository<GrupoEntity, Long>{

	GrupoEntity findByCodigo(Long codigoGrupo);
	
	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);

	
}
