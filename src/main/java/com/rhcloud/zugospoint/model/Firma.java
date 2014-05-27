package com.rhcloud.zugospoint.model;

public class Firma {
	private Integer nip;
	private Integer krs;
	private String nazwa;
	private Long idAdres;
	
	
	public Integer getNip() {
		return nip;
	}
	public void setNip(Integer nip) {
		this.nip = nip;
	}
	public Integer getKrs() {
		return krs;
	}
	public void setKrs(Integer krs) {
		this.krs = krs;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public Long getIdAdres() {
		return idAdres;
	}
	public void setIdAdres(Long idAdres) {
		this.idAdres = idAdres;
	}
}
