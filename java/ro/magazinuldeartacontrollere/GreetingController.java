package ro.magazinuldeartacontrollere;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.magazinuldeartastructura.structuraGreeting;

@RestController
public class GreetingController {
	
	private static final String template = "Bine ai venit, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public structuraGreeting greeting(@RequestParam(value = "name", defaultValue = "drag client") String name) {
		return new structuraGreeting(counter.incrementAndGet(), String.format(template, name));
	}
}
