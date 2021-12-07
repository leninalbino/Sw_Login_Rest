package com.example.appbackend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity()
@Table(name="aduser")
public class Aduser {
	
@Id	
@Column(name="us_coduser",length = 100)
	private String us_coduser;

@Column(name="us_iduser",length = 10)
	private String us_iduser;

@Column(name="us_nomuser",length = 100)
	private String us_nomuser;

@Column(name="us_pasword",length = 50)
	private String us_pasword;

@Column(name="us_ciacont",length = 20)
	private String us_ciacont;

@Column(name="us_idbd",length = 20)
	private String us_idbd;

@Column(name="us_codusubd", length = 10)
	private String us_codusubd;

@Column(name="us_ctipusu", length = 1)
	private String us_ctipusu;

@Column(name="us_usucre", length = 10)
	private String us_usucre;

@Temporal(TemporalType.TIMESTAMP)
@Column(name="us_feccre")
	private Date us_feccre;

@Column(name="us_usumod", length = 10)
	private String us_usumod;

@Temporal(TemporalType.TIMESTAMP)
@Column(name="us_fecmod")
	private Date us_fecmod;
	

	public Aduser() {  
}


	public String getUs_coduser() {
		return us_coduser;
	}


	public void setUs_coduser(String us_coduser) {
		this.us_coduser = us_coduser;
	}


	public String getUs_iduser() {
		return us_iduser;
	}


	public void setUs_iduser(String us_iduser) {
		this.us_iduser = us_iduser;
	}


	public String getUs_nomuser() {
		return us_nomuser;
	}


	public void setUs_nomuser(String us_nomuser) {
		this.us_nomuser = us_nomuser;
	}


	public String getUs_pasword() {
		return us_pasword;
	}


	public void setUs_pasword(String us_pasword) {
		this.us_pasword = us_pasword;
	}


	public String getUs_ciacont() {
		return us_ciacont;
	}


	public void setUs_ciacont(String us_ciacont) {
		this.us_ciacont = us_ciacont;
	}


	public String getUs_idbd() {
		return us_idbd;
	}


	public void setUs_idbd(String us_idbd) {
		this.us_idbd = us_idbd;
	}


	public String getUs_codusubd() {
		return us_codusubd;
	}


	public void setUs_codusubd(String us_codusubd) {
		this.us_codusubd = us_codusubd;
	}


	public String getUs_ctipusu() {
		return us_ctipusu;
	}


	public void setUs_ctipusu(String us_ctipusu) {
		this.us_ctipusu = us_ctipusu;
	}


	public String getUs_usucre() {
		return us_usucre;
	}


	public void setUs_usucre(String us_usucre) {
		this.us_usucre = us_usucre;
	}


	public Date getUs_feccre() {
		return us_feccre;
	}


	public void setUs_feccre(Date us_feccre) {
		this.us_feccre = us_feccre;
	}


	public String getUs_usumod() {
		return us_usumod;
	}


	public void setUs_usumod(String us_usumod) {
		this.us_usumod = us_usumod;
	}


	public Date getUs_fecmod() {
		return us_fecmod;
	}


	public void setUs_fecmod(Date us_fecmod) {
		this.us_fecmod = us_fecmod;
	}


	
}
	
	
