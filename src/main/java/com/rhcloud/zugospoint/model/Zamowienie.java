/**
 * 
 */
package com.rhcloud.zugospoint.model;

import java.util.Date;

/**
 * @author zugo
 *
 */
public class Zamowienie {
	private Long idZamowienia;
	private Date dataZlozenia;
	private Long idKlienta;
	private Long idDostawy;

	public Long getIdZamowienia() {
		return idZamowienia;
	}
	public void setIdZamowienia(Long idZamowienia) {
		this.idZamowienia = idZamowienia;
	}
	public Date getDataZlozenia() {
		return dataZlozenia;
	}
	public void setDataZlozenia(Date dataZlozenia) {
		this.dataZlozenia = dataZlozenia;
	}
	public Long getIdKlienta() {
		return idKlienta;
	}
	public void setIdKlienta(Long idKlienta) {
		this.idKlienta = idKlienta;
	}
	public Long getIdDostawy() {
		return idDostawy;
	}
	public void setIdDostawy(Long idDostawy) {
		this.idDostawy = idDostawy;
	}
}
