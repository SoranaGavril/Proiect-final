package ro.magazinuldeartacos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ro.magazinuldeartaproduse.Produs;

@Controller
public class CosController {

	private CosService cosService;
	private CosService cos = new CosService();

	@GetMapping("/cos")
	public String getAllProducts(Model a) {
		ArrayList<Produs> produse = cos.getProduse();
		a.addAttribute("cos", produse);
		return "cos";			
	}
}
