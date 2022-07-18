package ro.magazinuldearta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class MagazinuldeArtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagazinuldeArtaApplication.class, args);
	}

}
