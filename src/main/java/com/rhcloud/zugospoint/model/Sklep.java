package com.rhcloud.zugospoint.model;
import com.rhcloud.zugospoint.model.Punkt;
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
public class Sklep extends Punkt{
	private Long idSklepu;
	//private Punkt punkt;
	
	
	public Long getIdSklepu() {
		return idSklepu;
	}
	public void setIdSklepu(Long idSklepu) {
		this.idSklepu = idSklepu;
	}
	//public Punkt getPunkt() {
	//	return punkt;
	//}
	//public void setIdPunktu(Punkt punkt) {
	//	this.punktu = punkt;
	//}
}
