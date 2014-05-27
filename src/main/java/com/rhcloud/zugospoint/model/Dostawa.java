/**
 * 
 */
package com.rhcloud.zugospoint.model;

import java.util.Date;

/**
 * @author zugo
 *
 */
public class Dostawa {
	private Long idDostawy;
	private String nrPrzesylki;
	private Date dataNadania;
	private Long idDostawcy;
	private Boolean hurtowa;
	private Boolean doreczona;
	private Boolean zwrocona;
	
	public Long getIdDostawy() {
		return idDostawy;
	}
	public void setIdDostawy(Long idDostawy) {
		this.idDostawy = idDostawy;
	}
	public String getNrPrzesylki() {
		return nrPrzesylki;
	}
	public void setNrPrzesylki(String nrPrzesylki) {
		this.nrPrzesylki = nrPrzesylki;
	}
	public Date getDataNadania() {
		return dataNadania;
	}
	public void setDataNadania(Date dataNadania) {
		this.dataNadania = dataNadania;
	}
	public Long getIdDostawcy() {
		return idDostawcy;
	}
	public void setIdDostawcy(Long idDostawcy) {
		this.idDostawcy = idDostawcy;
	}
	public Boolean getHurtowa() {
		return hurtowa;
	}
	public void setHurtowa(Boolean hurtowa) {
		this.hurtowa = hurtowa;
	}
	public Boolean getDoreczona() {
		return doreczona;
	}
	public void setDoreczona(Boolean doreczona) {
		this.doreczona = doreczona;
	}
	public Boolean getZwrocona() {
		return zwrocona;
	}
	public void setZwrocona(Boolean zwrocona) {
		this.zwrocona = zwrocona;
	}

}
