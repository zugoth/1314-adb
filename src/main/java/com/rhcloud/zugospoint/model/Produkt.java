package com.rhcloud.zugospoint.model;

public class Produkt {
	private Long idProducktu;
	private String nazwa;
	private Long kodKreskowy;
	//private ?!? qrKod;
	private Long idKategorii;
	private String idKraju;
	
	
        public Long getIdProducktu() {
                return idProducktu;
        }
        public void setIdProducktu(Long idProducktu) {
                this.idProducktu = idProducktu;
        }
        public String getNazwa() {
                return nazwa;
        }
        public void setNazwa(String nazwa) {
                this.nazwa = nazwa;
        }
        public Long getKodKreskowy() {
                return kodKreskowy;
        }
        public void setKodKreskowy(Long kodKreskowy) {
                this.kodKreskowy = kodKreskowy;
        }
        public Long getKategoria() {
                return idKategorii;
        }
        public void setKategoria(Long kategoria) {
                this.idKategorii = kategoria;
        }
        public String getIdKraju() {
                return idKraju;
        }
        public void setIdKraju(String idKraju) {
                this.idKraju = idKraju;
        }

}