/**
 * 
 */
package com.rhcloud.zugospoint.model;

/**
 * @author zugo
 *
 */
public class Adres {
	private Long idAdres;
	private String ulica;
	private Integer nrBudynku;
	private Integer nrLokalu;
	private String kodPocztowy;
	
	
	public Long getIdAdres() {
		return idAdres;
	}
	public void setIdAdres(Long idAdres) {
		this.idAdres = idAdres;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public Integer getNrBudynku() {
		return nrBudynku;
	}
	public void setNrBudynku(Integer nrBudynku) {
		this.nrBudynku = nrBudynku;
	}
	public Integer getNrLokalu() {
		return nrLokalu;
	}
	public void setNrLokalu(Integer nrLokalu) {
		this.nrLokalu = nrLokalu;
	}
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
}