package ro.magazinuldeartautilizator;

import java.util.List;

import ro.magazinuldeartaproduse.Produs;

public class Comanda {
	private enum Stare {
		In_Procesare,
		Anulata,
		Livrata,
		Plata_in_asteptare,
		Returnata
	}
	private int numarcomanda;
	private Client client;
	private List<Produs> tablouri;
	private Stare stare;

	public Comanda() {}
	
	public Comanda(int numarcomanda, Client client, List<Produs> tablouri, Stare stare) {
		this.numarcomanda = numarcomanda;
		this.client = client;
		this.tablouri = tablouri;
		this.stare = stare;
	}
	
	public int getNumarcomanda() {
		return numarcomanda;
	}
	
	public void setNumarcomanda(int numarcomanda) {
		this.numarcomanda = numarcomanda;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	

	public List<Produs> getTablouri() {
		return tablouri;
	}

	public void setTablouri(List<Produs> tablouri) {
		this.tablouri = tablouri;
	}

	public Stare getStare() {
		return stare;
	}
	
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	
	@Override
	public String toString() {
		String a = "Numarul comenzii: " + numarcomanda + ", Client: " + client + ", Produse achizitionate: " + tablouri + ", Stare: " + stare;
		return a;
	}
	
}
