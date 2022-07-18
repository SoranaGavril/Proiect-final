package ro.magazinuldeartacos;

import java.util.ArrayList;

import ro.magazinuldeartaproduse.Produs;

public class CosService {

	private ArrayList<Produs> produse = new ArrayList<>();
	
	public CosService() {
		populate();
	}
	
	public ArrayList<Produs> getProduse() {
		return produse;
	}

	public void setProduse(ArrayList<Produs> produse) {
		produse.addAll(produse);
	}

	private void populate() {
		Produs p1 = new Produs("Felinarul", "Gavril Sorana", 200, 2021, "Acuarele");
		Produs p2 = new Produs("Peisaj japonez", "Gavril Sorana", 400, 2020, "Acrilic");
		Produs p3 = new Produs("Santorini", "Gavril Sorana", 200, 2022, "Acuarele");
		Produs p4 = new Produs("Simfonia florilor", "Gavril Sorana", 450, 2022, "Acrilic");
		Produs p5 = new Produs("Cascada", "Gavril Sorana", 400, 2021, "Acrilic");
		
		produse.add(p1);
		produse.add(p2);
		produse.add(p3);
		produse.add(p4);
		produse.add(p5);
	}
}
