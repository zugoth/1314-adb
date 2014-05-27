package com.rhcloud.zugospoint.model;

public class Klient {
	private Long idKlienta;
	private Long idFirmy;
	private Long idOsoby;
	private Long nick;
	private String passHash;
	
	
	public Long getIdKlienta() {
		return idKlienta;
	}
	public void setIdKlienta(Long idKlienta) {
		this.idKlienta = idKlienta;
	}
	public Long getIdFirmy() {
		return idFirmy;
	}
	public void setIdFirmy(Long idFirmy) {
		this.idFirmy = idFirmy;
	}
	public Long getIdOsoby() {
		return idOsoby;
	}
	public void setIdOsoby(Long idOsoby) {
		this.idOsoby = idOsoby;
	}
	public Long getNick() {
		return nick;
	}
	public void setNick(Long nick) {
		this.nick = nick;
	}
	public String getPassHash() {
		return passHash;
	}
	public void setPassHash(String passHash) {
		this.passHash = passHash;
	}
}
