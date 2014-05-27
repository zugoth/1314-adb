/**
 * 
 */
package com.rhcloud.zugospoint.model;

/**
 * @author zugo
 *
 */
public class Punkt {
	private Long idPunktu;
	private String nazwa;
	private Long idAdres;
	
	
	public Long getIdPunktu() {
		return idPunktu;
	}
	public void setIdPunktu(Long idPunktu) {
		this.idPunktu = idPunktu;
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
