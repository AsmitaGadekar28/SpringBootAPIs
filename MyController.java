package com.tka.SpringAPIs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//calling functionality
@RequestMapping("/Flights")
public class MyController {

	@RequestMapping(value="/Kolhapur_Airport", method=RequestMethod.PUT)
	public String Airline1() {
		return "Flight 5001 : Kolhapur to Mumbai , flight Time :06:00 to 8:45";
	}
	
	@GetMapping("/Canada_Airport")
	public String Airline2() {
		return "Flight 5002 : Canada to Delhi , flight Time :11:00 to 4:45";
	}
	@PostMapping("/Mumbai_Airport")
	public String ThirdAPI() {
		return "Flight 5001 : Mumbai to Goa , flight Time :12:00 to 3:30";
	}
	@PutMapping("/Pune_Airport")
	public String FourthAPI() {
		return "Flight 5001 : Pune to Kolhapur , flight Time :04:00 to 6:45";
	}
	
}
