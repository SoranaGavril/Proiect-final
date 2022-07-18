package ro.magazinuldeartacos;

import java.util.ArrayList;

import ro.magazinuldeartaproduse.Produs;

public class Cos {
	private ArrayList<Produs> produse = new ArrayList<Produs>();
	private double totalCost;
	
	public Cos() {}
	
	public Cos(ArrayList<Produs> produse, double totalCost) {
		this.produse = produse;
		this.totalCost = totalCost;
	}
	
	public ArrayList<Produs> getProdus() {
		return produse;
	}
	
	public void setProdus(ArrayList<Produs> produse) {
		this.produse = produse;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public void addProdus(Produs produs) {
		produse.addAll(produse);
	}
	
	@Override
	public String toString() {
		String s = "Produse: " + produse + ", Cost total: " + totalCost;
		return s;
	}
	
}
