package com.example.appbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.appbackend.model.Adbdcias;
import com.example.appbackend.model.Aduser;
@Repository
public interface Aduser_Repository extends JpaRepository<Aduser, String>{
	//@Query("select u from Aduser u where u.us_coduser = ?1 ")
		//public Aduser findByUsCoduser(String cod);
	
	//@Query ("Select adu, adc from Aduser adu, Adcia adc where adu.us_idbd = ?1, adc.ci_codcia=?2 ")
	//public Adbdcias findByDatos(String cod, String Id);
	
	
}

