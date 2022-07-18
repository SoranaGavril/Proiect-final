package ro.magazinuldeartaproduse;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="Produse")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String titlu;
	protected String autor;
	protected double pret;
	protected int an_realizare;
	protected String mediu_pictura;
	
	
	public Produs() {}
	
	public Produs(String titlu, String autor, double pret, int an_realizare, String mediu_pictura) {
		this.titlu = titlu;
		this.autor = autor;
		this.pret= pret;
		this.an_realizare = an_realizare;
		this.mediu_pictura = mediu_pictura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public int getAn_realizare() {
		return an_realizare;
	}

	public void setAn_realizare(int an_realizare) {
		this.an_realizare = an_realizare;
	}

	public String getMediu_pictura() {
		return mediu_pictura;
	}

	public void setMediu_pictura(String mediu_pictura) {
		this.mediu_pictura = mediu_pictura;
	}

	@Override
	public String toString() {
		String a = "Id: " + id + "Titlu: " + titlu + ", Autor: " + autor + ", Pret: " + pret + ", An realizare: " + an_realizare +", Mediul prin care a fost realizat tabloul" + mediu_pictura;
		return a;
	}
}
