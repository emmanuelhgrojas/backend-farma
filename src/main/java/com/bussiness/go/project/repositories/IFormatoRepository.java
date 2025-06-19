package com.bussiness.go.project.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bussiness.go.project.entities.commons.Formato;

@Repository
public interface IFormatoRepository extends JpaRepository<Formato, UUID>{

}
