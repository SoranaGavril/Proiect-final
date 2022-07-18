package ro.magazinuldeartastructura;

public class structuraGreeting {
	
	private final long id;
	private final String afisare;
	
	public structuraGreeting(long id, String afisare) {
		this.id = id;
		this.afisare = afisare;
	}
	
	public long getId() {
		return id;
	}
	
	public String getAfisare() {
		return afisare;
	}
}
