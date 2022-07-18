package ro.magazinuldeartacontrollere;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import ro.magazinuldeartastructura.structuraclient;
import ro.magazinuldeartautilizator.Cont;
import java.util.ArrayList;



@Controller
public class ClientController {

	private structuraclient structuraclient = new structuraclient();

	@GetMapping("/clienti")
	public String getAllClienti(Model a) {
		ArrayList<Cont> conturi = structuraclient.getConturi();
		a.addAttribute("clienti", conturi);
		return "clienti";
	}
	@RequestMapping(value = "/clienti/{prenume}", method = RequestMethod.GET)
	public String getCustomerByFirstName(@PathVariable(name = "prenume") String prenume, Model model) {
		
		ArrayList<Cont> conturi = structuraclient.getConturi();
	
		for(Cont a : conturi) {
			if(a.getnume().equals(prenume)) {
				model.addAttribute("clienti ordonati dupa prenume", a);
				return "clienti ordonati dupa prenume";
			}
		}
		return null;
	}

}
