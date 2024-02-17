package com.pbl.cir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class CirApplication {

	@Autowired
	private CircuitRepository repository;

	@PostMapping("/addCircuit")
	public Circuit addCircuit(@RequestBody Circuit circuit) {
		return repository.save(circuit);
	}

	@GetMapping("/getCircuits")
	public List<Circuit> getCircuits() {
		return repository.findAll();
	}

	@GetMapping("/printMessage")
	public String printMessage() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(CirApplication.class, args);
	}

}
