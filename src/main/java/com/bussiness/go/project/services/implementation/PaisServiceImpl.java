package com.bussiness.go.project.services.implementation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bussiness.go.project.entities.commons.Pais;
import com.bussiness.go.project.repositories.IPaisRepository;
import com.bussiness.go.project.services.IPaisService;

@Service
public class PaisServiceImpl extends CommonServiceImpl<Pais, IPaisRepository, UUID> implements IPaisService{

	@Autowired
	private IPaisRepository iPaisRepository;
}
