package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmploController {
	
	@Autowired
	private EmployService service;
	
	@GetMapping(value="/showAllEmploy")
	public List<Employ> showEmploy() {
		return service.showAll();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return service.searchEmploy(id);
	}
	
	@PostMapping(value="/addEmploy")
	public void addEmploy(@RequestBody Employ employ) {
		service.addEmploy(employ);
	}
	

}
