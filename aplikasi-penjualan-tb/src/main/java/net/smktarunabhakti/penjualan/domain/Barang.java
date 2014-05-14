package net.smktarunabhakti.penjualan.domain;
/*
 * @author : Rifqisec 
 * @package: net.smktarunabhakti.penjualan.domain
 */
public class Barang {
	private String id;
	private String kodeBarang;
	private String namaBarang;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKodeBarang() {
		return kodeBarang;
	}
	public void setKodeBarang(String kodeBarang) {
		this.kodeBarang = kodeBarang;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
}
