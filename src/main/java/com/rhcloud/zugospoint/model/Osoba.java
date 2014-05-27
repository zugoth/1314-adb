package com.rhcloud.zugospoint.model;

public class Osoba {
	private String imie;
	private String nazwisko;
	private Integer pesel;
	private Long idAdres;

	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Integer getPesel() {
		return pesel;
	}
	public void setPesel(Integer pesel) {
		this.pesel = pesel;
	}
	public Long getIdAdres() {
		return idAdres;
	}
	public void setIdAdres(Long idAdres) {
		this.idAdres = idAdres;
	}
}
