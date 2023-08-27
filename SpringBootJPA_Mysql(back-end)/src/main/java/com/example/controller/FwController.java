package com.example.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.FrameworkRepo;
import com.example.model.Framework;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class FwController {
	
	@Autowired
	FrameworkRepo repo;
	
	
	@PostMapping("/addData")
	public Framework addFramework(Framework fw) {
		repo.save(fw);
		System.out.println("Saved successfully");
		
		return fw;
	}
	
	@PutMapping("/addData")
	public Framework updFramework(@RequestBody Framework fw) {
		repo.save(fw);
		System.out.println("Updated or created successfully");
		
		return fw;
	}
	
	@GetMapping("/getData")
    public List<Framework> getAllData() {
        return (List<Framework>) repo.findAll();

    }
	
	@GetMapping("/getData/{id}")
	public Optional<Framework> getFrameworkbyId(@PathVariable("id") int id) {
		Optional<Framework> fm = repo.findById(id);
		return fm;
	}
	
	@DeleteMapping("/delData/{id}")
	public int delFramework(@PathVariable("id") int id) {
		repo.deleteById(id);
		System.out.println("deleted successfully");
		
		return id;
	}

}
