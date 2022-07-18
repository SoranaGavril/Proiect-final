package ro.magazinuldeartastructura;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import ro.magazinuldeartautilizator.Client;
import ro.magazinuldeartautilizator.Cont;

public class structuraclient {

	private ArrayList<Cont> conturi = new ArrayList<>();
	public structuraclient() {
		try {
			populate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Cont> getConturi() {
		return conturi;
	}

	public void setConturi(ArrayList<Cont> conturi) {
		conturi.addAll(conturi);
	}

	private void populate() throws ParseException {
		String a1 = "31/03/2022";  
	    Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(a1);  
	    
	    String a2 = "20/05/2022";  
	    Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(a2);  
	    
	    String a3 = "19/02/2022";  
	    Date d3 = new SimpleDateFormat("dd/MM/yyyy").parse(a3);  
	    
	    String a4 = "01/07/2022";  
	    Date d4 = new SimpleDateFormat("dd/MM/yyyy").parse(a4); 
	  
		
		
		Cont b1 = new Client();
		Cont b2 = new Client();
		Cont b3 = new Client();
	
		conturi.add(b1);
		conturi.add(b2);
		conturi.add(b3);
	}
}
