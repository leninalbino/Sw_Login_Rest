package com.example.appbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "adbdcias")
public class Adbdcias {

	@Id
	@Column(name = "cu_codcia", length = 20)
	private String cu_codcia;
	@JoinColumn( )
	@Column(name = "cu_idbd", length = 20)
	private String cu_idbd;

	@Column(name = "cu_ServidorBD", length = 80)
	private String cu_ServidorBD;

	@Column(name = "cu_userBD", length = 80)
	private String cu_userBD;

	@Column(name = "cu_paswBD", length = 80)
	private String cu_paswBD;

	@Column(name = "cu_portBD", length = 10)
	private String cu_portBD;

	@Column(name = "cu_usucre", length = 10)
	private String cu_usucre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cu_feccre")
	private Date cu_feccre;

	@Column(name = "cu_usumod", length = 10)
	private String cu_usumod;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cu_fecmod")
	private Date cu_fecmod;
	
	


	public String getCu_codcia() {
		return cu_codcia;
	}

	public void setCu_codcia(String cu_codcia) {
		this.cu_codcia = cu_codcia;
	}

	public String getCu_idbd() {
		return cu_idbd;
	}

	public void setCu_idbd(String cu_idbd) {
		this.cu_idbd = cu_idbd;
	}

	public String getCu_ServidorBD() {
		return cu_ServidorBD;
	}

	public void setCu_ServidorBD(String cu_ServidorBD) {
		this.cu_ServidorBD = cu_ServidorBD;
	}

	public String getCu_userBD() {
		return cu_userBD;
	}

	public void setCu_userBD(String cu_userBD) {
		this.cu_userBD = cu_userBD;
	}

	public String getCu_paswBD() {
		return cu_paswBD;
	}

	public void setCu_paswBD(String cu_paswBD) {
		this.cu_paswBD = cu_paswBD;
	}

	public String getCu_portBD() {
		return cu_portBD;
	}

	public void setCu_portBD(String cu_portBD) {
		this.cu_portBD = cu_portBD;
	}

	public String getCu_usucre() {
		return cu_usucre;
	}

	public void setCu_usucre(String cu_usucre) {
		this.cu_usucre = cu_usucre;
	}

	public Date getCu_feccre() {
		return cu_feccre;
	}

	public void setCu_feccre(Date cu_feccre) {
		this.cu_feccre = cu_feccre;
	}

	public String getCu_usumod() {
		return cu_usumod;
	}

	public void setCu_usumod(String cu_usumod) {
		this.cu_usumod = cu_usumod;
	}

	public Date getCu_fecmod() {
		return cu_fecmod;
	}

	public void setCu_fecmod(Date cu_fecmod) {
		this.cu_fecmod = cu_fecmod;
	}

	public Adbdcias(String cu_codcia, String cu_idbd, String cu_ServidorBD, String cu_userBD, String cu_paswBD,
			String cu_portBD, String cu_usucre, Date cu_feccre, String cu_usumod, Date cu_fecmod) {
		super();
		this.cu_codcia = cu_codcia;
		this.cu_idbd = cu_idbd;
		this.cu_ServidorBD = cu_ServidorBD;
		this.cu_userBD = cu_userBD;
		this.cu_paswBD = cu_paswBD;
		this.cu_portBD = cu_portBD;
		this.cu_usucre = cu_usucre;
		this.cu_feccre = cu_feccre;
		this.cu_usumod = cu_usumod;
		this.cu_fecmod = cu_fecmod;
	}

	public Adbdcias() {
		super();

	}

}
