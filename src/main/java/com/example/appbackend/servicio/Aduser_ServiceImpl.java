package com.example.appbackend.servicio;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.appbackend.Response.BadRequestException;
import com.example.appbackend.model.Adbdcias;
import com.example.appbackend.model.Adcias;
import com.example.appbackend.model.Aduser;
import com.example.appbackend.repository.AdbdciasRepository;
import com.example.appbackend.repository.Aduser_Repository;

@Service

public class Aduser_ServiceImpl implements I_Aduser_Service{

	@Autowired
	private Aduser_Repository aduserRepo;
	
	
	@Transactional(readOnly = true)
	@Override
	
	public Aduser BuscaUserL(String cod) {
		Adcias ad = new Adcias();
		if (!aduserRepo.existsById(cod)) {
				throw new  BadRequestException("No se Encontro el Usuario Solicado");
				}
		return aduserRepo.findById(cod).orElse(null);
		  
	}
	

	@Autowired
	private AdbdciasRepository repo;
	
	@Transactional(readOnly = true)
	public Adbdcias BuscaCiaContra(String us_ciacont) {
		return repo.BuscaCiaContra(us_ciacont);
		
	}
	@Transactional(readOnly = true)
	public Adbdcias buscar (String a, String b) {
		
		return repo.findByDatos(a, b);
	}
	
	

	
}
