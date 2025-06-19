package com.bussiness.go.project.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bussiness.go.project.entities.commons.BandejaFormatoModel;

@Repository
public interface IBandejaFormatoRepository extends JpaRepository<BandejaFormatoModel, UUID>{

	@Query(value ="SELECT \n"
			+ "  v.viaje_id, \n"
			+ "  v.formato_pais_residencia, \n"
			+ "  v.formato_nacionalidad, \n"
			+ "  v.formato_sexo, \n"
			+ "  v.formato_edad  \n"
			+ "FROM formularios.viaje v\n"
			+ "WHERE v.formato_estado = :estado \n"
			+ "  AND (\n"
			+ "    CAST(v.viaje_id AS TEXT) ILIKE '%' || :filtro || '%' \n"
			+ "    OR v.formato_pais_residencia ILIKE '%' || :filtro || '%' \n"
			+ "    OR v.formato_nacionalidad ILIKE '%' || :filtro || '%' \n"
			+ "    OR v.formato_sexo ILIKE '%' || :filtro || '%' \n"
			+ "    OR CAST(v.formato_edad AS TEXT) ILIKE '%' || :filtro || '%'\n"
			+ "  )\n"
			+ "LIMIT :limitQuery OFFSET :offsetQuery", nativeQuery = true)
	public List<BandejaFormatoModel> listaFormatosPorEstadoConFiltro(String filtro, String estado, Integer limitQuery, Integer offsetQuery);
	
	@Query(value ="SELECT v.viaje_id, v.formato_pais_residencia, v.formato_nacionalidad, v.formato_sexo, v.formato_edad  FROM formularios.viaje as v \n"
			+ "WHERE v.formato_estado = :estado\n"			
			+ "limit :limitQuery offset :offsetQuery", nativeQuery = true)
	public List<BandejaFormatoModel> listaFormatosPorEstadoSinFiltro(String estado, Integer limitQuery, Integer offsetQuery);
	
	@Query(value ="SELECT v.viaje_id, v.formato_pais_residencia, v.formato_nacionalidad, v.formato_sexo, v.formato_edad  FROM formularios.viaje as v WHERE formato_estado = :estado\n", nativeQuery = true)
	public List<BandejaFormatoModel> totalListaFormatosPorEstado(String estado);
}
