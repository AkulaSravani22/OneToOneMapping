package com.assignment.OneToOneMapping.Controller;
//import java.util.HashMap;

//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.OneToOneMapping.Entity.Instructor;

import com.assignment.OneToOneMapping.service.InstructorService;

@RestController
@RequestMapping("api/v1")
public class InstructorController{
	 @Autowired
	    private InstructorService instructorService;


	    public InstructorService getInstructorService() {
		return instructorService;
	}


	public void setInstructorService(InstructorService instructorService) {
		this.instructorService = instructorService;
	}


		@GetMapping("/{id}")
	    public  Instructor  getInstructors(@PathVariable    Instructor instructor) {
	        return instructorService.save(instructor);
	    }
	    
	    
	    @PostMapping
	    public Instructor createUser(@RequestBody Instructor instructor) {
	        return instructorService.save(instructor);
	    }
	    
	    @PutMapping()
		public Instructor updateEmp(@RequestBody Instructor instructor)
		{
			return instructorService.update(instructor);
			
		}
		@DeleteMapping(path ="/{id}")
		public String deleteEmp(@PathVariable Long id)
		{
			return instructorService.delete(id);
			
		}

}