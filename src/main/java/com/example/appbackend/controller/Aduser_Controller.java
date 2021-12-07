package com.example.appbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appbackend.Response.ExceptionConfig;
import com.example.appbackend.model.Adbdcias;
import com.example.appbackend.model.Adcias;
import com.example.appbackend.model.Aduser;
import com.example.appbackend.servicio.Aduser_ServiceImpl;
import com.example.appbackend.servicio.I_Aduser_Service;

@RestController
@RequestMapping("/")
public class Aduser_Controller {
	@Autowired
	private I_Aduser_Service iAduserService;
	@Autowired
	private  Aduser_ServiceImpl adu;
	
	/*
	 * private static final ResponseEntity NO_ENCONTRADO =
	 * ResponseEntity.status(Response.Status.NOT_FOUND) .entity(new
	 * Mensaje("Id del Usuario no existe")) .build();
	 * 
	 * private static final Response USUARIO_EXISTE =
	 * Response.status(Response.Status.BAD_REQUEST) .entity(new
	 * Mensaje("El Usuario ya existe")) .build();
	 * 
	 * private static final Response USUARIO_CREADO =
	 * Response.status(Response.Status.CREATED) .entity(new
	 * Mensaje("Usuario creado correctamente")) .build();
	 * 
	 * private static final Response OK = Response.status(Response.Status.OK)
	 */
	
	
	
	// @PathVariable (/find/{id})
	// @RequestParam
	// @GetMapping("/find/{id}")
	@GetMapping("/buscar/{cod}")
	public ResponseEntity<Aduser> findById(@PathVariable String cod) {
		Aduser lista = iAduserService.BuscaUserL(cod);
		Adcias ad = new Adcias();
	
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/v2/{a}/{b}")
	public ResponseEntity<Adbdcias> findBy(@PathVariable("a") String a, @PathVariable("b") String b) {
		Adbdcias lista = adu.buscar(a, b);
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/v2/{a}")
	public ResponseEntity<Adbdcias> findBy(@PathVariable("a") String us_ciacont) {
		Adbdcias lista = adu.BuscaCiaContra(us_ciacont);
		return ResponseEntity.ok().body(lista);
	}
	
}
