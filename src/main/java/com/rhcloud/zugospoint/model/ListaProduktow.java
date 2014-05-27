/**
 * 
 */
package com.rhcloud.zugospoint.model;

/**
 * @author zugo
 *
 */
public class ListaProduktow {
	private Long idZamowinia;
	private Long idProduktu; //1-1
	private Long ilosc;
	
	public Long getIdZamowinia() {
		return idZamowinia;
	}
	public void setIdZamowinia(Long idZamowinia) {
		this.idZamowinia = idZamowinia;
	}
	public Long getIdProduktu() {
		return idProduktu;
	}
	public void setIdProduktu(Long idProduktu) {
		this.idProduktu = idProduktu;
	}
	public Long getIlosc() {
		return ilosc;
	}
	public void setIlosc(Long ilosc) {
		this.ilosc = ilosc;
	}
}
