package com.bussiness.go.project.services;

import java.util.List;

import com.bussiness.go.project.entities.commons.Usuario;

public interface IUsuarioServicePaging {

	List<Usuario> findPaginated(Integer pageNo, Integer pageSize);
}
