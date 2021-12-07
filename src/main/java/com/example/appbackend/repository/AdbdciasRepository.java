package com.example.appbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.appbackend.model.Adbdcias;

public interface AdbdciasRepository extends JpaRepository<Adbdcias, String>{

	@Query (value="select * from adbdcias inner join aduser as ad_u on ad_u.us_idbd = ?1 inner join adcias as ad_c on ad_c.ci_codcia = ?2 ", 
			nativeQuery = true)
	// del la tabla cia a usuarior
	//value="select * from adbdcias inner join aduser as ad_u on ad_u.us_idbd = adbdcias.cu_idbd"
		//	+ "inner join adcias as ad_c on ad_c.ci_codcia =adbdcias.cu_codcia "
	public Adbdcias findByDatos(String cod, String Id);
	
	
	@Query (value ="select * from adbdcias inner join aduser as ad_u on ad_u.us_ciacont= ?1",nativeQuery = true)
	
	public Adbdcias BuscaCiaContra(String cod);
	
	
	
	
}
