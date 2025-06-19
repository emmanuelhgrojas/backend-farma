package com.bussiness.go.project.repositories;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bussiness.go.project.entities.commons.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, UUID>{

	Optional<Usuario> findOneByUsuaUsernameOrUsuaEmailAndUsuaEstado(String usuaUsername, String usuaEmail, String usuaEstado);
	
	Optional<Usuario> findOneByUsuaUsernameAndUsuaEstado(String usuaUsername, String usuaEstado);
	
	Optional<Usuario> findOneByUsuaIdAndUsuaEstado(UUID usuaId, String usuaEstado);
	
	@Query(value ="SELECT u.* FROM administracion.usuario AS u \n"
			+ "WHERE u.usua_estado IN :listaEstadosUsuarios AND u.usua_email = :usuaEmail", nativeQuery = true)
	Optional<Usuario> buscarUsuarioPorEmailEstados(String usuaEmail, Collection<String> listaEstadosUsuarios);	
	
	@Query(value ="SELECT u.* FROM administracion.usuario AS u \n"
			+ "WHERE u.usua_estado IN :listaEstadosUsuarios AND u.usua_username = :usuaUsername", nativeQuery = true)
	Optional<Usuario> buscarUsuarioPorEstados(String usuaUsername, Collection<String> listaEstadosUsuarios);
}
