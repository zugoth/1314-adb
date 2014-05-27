package com.rhcloud.zugospoint.model;
/**
 * sklep tez jest magazynem mozna z niego 
 * wycofac produkt do magazynu, 
 * istnieje jeden sklep internetowy
 * ktory moze zlecac wysylki z magazynu glownego
 * albo z magazynow sklepowych
 * 
 * @author zugo
 *
 */
public class Sklep {
	private Long idSklepu;
	private Long idPunktu;
	
	
	public Long getIdSklepu() {
		return idSklepu;
	}
	public void setIdSklepu(Long idSklepu) {
		this.idSklepu = idSklepu;
	}
	public Long getIdPunktu() {
		return idPunktu;
	}
	public void setIdPunktu(Long idPunktu) {
		this.idPunktu = idPunktu;
	}
}
