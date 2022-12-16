package com.example.TrueClubAssingment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TrueClubAssingment.Entity.Assignment;
import com.example.TrueClubAssingment.Service.AssignmentService;



@RestController
public class HomeController {
	@Autowired
	AssignmentService as;
	
	@PostMapping("/assign")
	public ResponseEntity<Assignment> save(@RequestBody Assignment assign){
		
		return new ResponseEntity<>(as.save(assign),HttpStatus.OK);
		
	}
	@GetMapping("/assign/{id}")
	public ResponseEntity<Assignment> getByid(@PathVariable("id") int  id) {
		
		return new ResponseEntity<>(as.getById(id),HttpStatus.OK);
	}
	@GetMapping("/assign")
	public ResponseEntity<List<Assignment>> getUsers() {
		return new ResponseEntity<>(as.getAll(),HttpStatus.OK);
	}

	@PutMapping("/assign")
	public ResponseEntity<Assignment> update(@RequestBody Assignment assign){
		
		return new ResponseEntity<>(as.updateRecord(assign),HttpStatus.OK);
		
	}
	@DeleteMapping("/assign/{id}")
	public  ResponseEntity<String>  deleteByid(@PathVariable("id") int  id) {
		return new ResponseEntity<>(as.deleteById(id),HttpStatus.OK);
	}

}
