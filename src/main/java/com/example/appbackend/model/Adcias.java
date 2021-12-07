package com.example.appbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name="Adcias")
public class Adcias {

	@Id
	@Column(name = "ci_codcia", length = 20)
	private String ci_codcia;
	
	@Column(name = "ci_nomcia", length = 100)
	private String ci_nomcia;
	
	@Column(name = "ci_estado", length = 1)
	private String ci_estado;
	
	@Column(name = "ci_tdocide", length = 1)
	private String ci_tdocide;
	
	@Column(name = "ci_ndocide", length = 20)
	private String ci_ndocide;
	
	@Column(name = "ci_cantcias", length = 4)
	private String ci_cantcias;
	
	@Column(name = "ci_canturs", length = 4)
	private String ci_canturs;
	
	@Column(name = "ci_flgconta", length = 1)
	private String ci_flgconta; 	
	
	@Column(name = "ci_flgcomer", length = 1)
	private String ci_flgcomer;
	
	@Column(name = "ci_flgplanil", length = 1)
	private String ci_flgplanil;

	@Column(name = "ci_codplan", length = 10)
	private String ci_codplan;
	
	@Column(name = "ci_usucre", length = 10)
	private String ci_usucre;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ci_feccre")
	private Date ci_feccre;
	
	@Column(name = "ci_usumod", length = 10)
	private Date ci_usumod;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ci_fecmod")
	private Date ci_fecmod;
	


	public Adcias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adcias(String ci_codcia, String ci_nomcia, String ci_estado, String ci_tdocide, String ci_ndocide,
			String ci_cantcias, String ci_canturs, String ci_flgconta, String ci_flgcomer, String ci_flgplanil,
			String ci_codplan, String ci_usucre, Date ci_feccre, Date ci_usumod, Date ci_fecmod) {
		super();
		this.ci_codcia = ci_codcia;
		this.ci_nomcia = ci_nomcia;
		this.ci_estado = ci_estado;
		this.ci_tdocide = ci_tdocide;
		this.ci_ndocide = ci_ndocide;
		this.ci_cantcias = ci_cantcias;
		this.ci_canturs = ci_canturs;
		this.ci_flgconta = ci_flgconta;
		this.ci_flgcomer = ci_flgcomer;
		this.ci_flgplanil = ci_flgplanil;
		this.ci_codplan = ci_codplan;
		this.ci_usucre = ci_usucre;
		this.ci_feccre = ci_feccre;
		this.ci_usumod = ci_usumod;
		this.ci_fecmod = ci_fecmod;
	}

	public String getCi_codcia() {
		return ci_codcia;
	}

	public void setCi_codcia(String ci_codcia) {
		this.ci_codcia = ci_codcia;
	}

	public String getCi_nomcia() {
		return ci_nomcia;
	}

	public void setCi_nomcia(String ci_nomcia) {
		this.ci_nomcia = ci_nomcia;
	}

	public String getCi_estado() {
		return ci_estado;
	}

	public void setCi_estado(String ci_estado) {
		this.ci_estado = ci_estado;
	}

	public String getCi_tdocide() {
		return ci_tdocide;
	}

	public void setCi_tdocide(String ci_tdocide) {
		this.ci_tdocide = ci_tdocide;
	}

	public String getCi_ndocide() {
		return ci_ndocide;
	}

	public void setCi_ndocide(String ci_ndocide) {
		this.ci_ndocide = ci_ndocide;
	}

	public String getCi_cantcias() {
		return ci_cantcias;
	}

	public void setCi_cantcias(String ci_cantcias) {
		this.ci_cantcias = ci_cantcias;
	}

	public String getCi_canturs() {
		return ci_canturs;
	}

	public void setCi_canturs(String ci_canturs) {
		this.ci_canturs = ci_canturs;
	}

	public String getCi_flgconta() {
		return ci_flgconta;
	}

	public void setCi_flgconta(String ci_flgconta) {
		this.ci_flgconta = ci_flgconta;
	}

	public String getCi_flgcomer() {
		return ci_flgcomer;
	}

	public void setCi_flgcomer(String ci_flgcomer) {
		this.ci_flgcomer = ci_flgcomer;
	}

	public String getCi_flgplanil() {
		return ci_flgplanil;
	}

	public void setCi_flgplanil(String ci_flgplanil) {
		this.ci_flgplanil = ci_flgplanil;
	}

	public String getCi_codplan() {
		return ci_codplan;
	}

	public void setCi_codplan(String ci_codplan) {
		this.ci_codplan = ci_codplan;
	}

	public String getCi_usucre() {
		return ci_usucre;
	}

	public void setCi_usucre(String ci_usucre) {
		this.ci_usucre = ci_usucre;
	}

	public Date getCi_feccre() {
		return ci_feccre;
	}

	public void setCi_feccre(Date ci_feccre) {
		this.ci_feccre = ci_feccre;
	}

	public Date getCi_usumod() {
		return ci_usumod;
	}

	public void setCi_usumod(Date ci_usumod) {
		this.ci_usumod = ci_usumod;
	}

	public Date getCi_fecmod() {
		return ci_fecmod;
	}

	public void setCi_fecmod(Date ci_fecmod) {
		this.ci_fecmod = ci_fecmod;
	}
	
	


}
