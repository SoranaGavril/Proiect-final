package ro.magazinuldeartautilizator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final Client client = clientRepository.findByUsername(username);
		
		if(client == null) {
			throw new UsernameNotFoundException(username);
		}
		
		UserDetails user = User.withUsername(client.getUsername()).password(client.getPassword()).authorities(client.getRole()).build();
		return user;
	}
}
