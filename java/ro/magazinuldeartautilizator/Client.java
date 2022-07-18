package ro.magazinuldeartautilizator;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ro.magazinuldeartacos.Cos;
import ro.magazinuldeartaproduse.Produs;

@Entity
public class Client extends Cont {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private Boolean enabled;
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Client() {}

	public Client(Boolean enabled, String role, String username, String password) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
	}

	public Client(String prenume, String nume, String email, String numartelefon,
			String adresafacturare, String adresalivrare, Date datainregistrare) {
		super(prenume, nume, email, numartelefon, adresafacturare, adresalivrare, datainregistrare);
	}
	
	public Client(String prenume, String nume, Cos cos, String email, String numartelefon,
			String adresafacturare, String adresalivrare, Date datainregistrare) {
		super(prenume, nume, cos, email, numartelefon, adresafacturare, adresalivrare, datainregistrare);
	}



	
}
