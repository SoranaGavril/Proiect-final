package ro.magazinuldeartautilizator;

import java.util.Date;
import java.util.List;

import ro.magazinuldeartacos.Cos;

public class Cont {
	private String prenume;
	private String nume;
	private Cos cos;
	private String email;
	private String numartelefon;
	private String adresafacturare;
	private String adresalivrare;
	private Date datainregistrare;


	
	public Cont() {}
	
	public Cont(String prenume, String nume, String email, String numartelefon, String adresafacturare, 
			String adresalivrare, Date datainregistrare) {
		this.prenume = prenume;
		this.nume = nume;
		this.email = email;
		this.numartelefon = numartelefon;
		this.adresafacturare = adresafacturare;
		this.adresalivrare = adresalivrare;
		this.datainregistrare = datainregistrare;

	}

	public Cont(String prenume, String nume, Cos cos, String email, String numartelefon, String adresafacturare, 
			String adresalivrare, Date datainregistrare) {
		this.prenume = prenume;
		this.nume = nume;
		this.cos = cos;
		this.email = email;
		this.numartelefon = numartelefon;
		this.adresafacturare = adresafacturare;
		this.adresalivrare = adresalivrare;
		this.datainregistrare = datainregistrare;

	}


	public String getprenume() {
		return prenume;
	}
	
	public void setprenume(String prenume) {
		this.prenume = prenume;
	}
	
	public String getnume() {
		return nume;
	}
	
	public void setnume(String nume) {
		this.nume = nume;
	}
	
	public Cos getCos() {
		return cos;
	}
	
	public void setCos(Cos cos) {
		this.cos = cos;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getnumartelefon() {
		return numartelefon;
	}
	
	public void setnumartelefon(String numartelefon) {
		this.numartelefon = numartelefon;
	}
	
	public String getadresafacturare() {
		return adresafacturare;
	}
	
	public void setadresafacturare(String adresafacturare) {
		this.adresafacturare = adresafacturare;
	}
	
	public String getadresalivrare() {
		return adresalivrare;
	}
	
	public void setadresalivrare(String adresalivrare) {
		this.adresalivrare = adresalivrare;
	}
	
	public Date getdatainregistrare() {
		return datainregistrare;
	}
	
	public void setdatainregistrare(Date datainregistrare) {
		this.datainregistrare = datainregistrare;
	}
	


	@Override
	public String toString() {
		String a = "Prenume: " + prenume + ", Nume: " + nume + ", Numar de telefon: " + numartelefon
				+ ", Email: " + email + ", Adresa de facturare: " + adresafacturare + ", Adresa de livrare: " + adresalivrare
				+ ", Data inregistrarii: " + datainregistrare + ", Cos: " + cos;
		return a;
	}
	
	
}
