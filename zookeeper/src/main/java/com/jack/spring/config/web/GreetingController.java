/**
 * 
 */
package com.jack.spring.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jaikishan Gurav
 *
 */
@RestController
@RequestMapping("greet")
public class GreetingController {

	@Value(value = "${user.greeting.english}")
	private String englishGreeting;

	@Value(value = "${user.greeting.french}")
	private String frenchGreeting;

	@GetMapping
	public String greeting(@RequestParam String language) {
		if (language.equalsIgnoreCase("english")) {
			return englishGreeting;
		} else {
			return frenchGreeting;
		}
	}

}
