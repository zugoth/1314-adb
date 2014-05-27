package com.rhcloud.zugospoint.model;

public class MagazynProdukt {
	private Long idProduktu;
	private Long idPunktu;
	private Long ilosc;
	
	
	public Long getIdProduktu() {
		return idProduktu;
	}
	public void setIdProduktu(Long idProduktu) {
		this.idProduktu = idProduktu;
	}
	public Long getIdMagazynu() {
		return idPunktu;
	}
	public void setIdMagazynu(Long idMagazynu) {
		this.idPunktu = idMagazynu;
	}
	public Long getIlosc() {
		return ilosc;
	}
	public void setIlosc(Long ilosc) {
		this.ilosc = ilosc;
	}
}
