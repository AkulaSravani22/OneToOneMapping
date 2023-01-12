package com.assignment.OneToOneMapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.OneToOneMapping.Entity.InstructorDetails;
import com.assignment.OneToOneMapping.service.InstructorDetailsService;

@RestController
@RequestMapping("api/v2")
public class InstructorDetailsController {
	
	@Autowired
	private InstructorDetailsService detailsService;
	@PostMapping
	public InstructorDetails save(@RequestBody InstructorDetails inDetails)
	{
		
		return detailsService.save(inDetails);
		
	}
	@GetMapping("/{id}")
	public InstructorDetails getInstructorDetails(@PathVariable   Long id)
	{
		return detailsService.getInstructorDetails(id);
		
	}

	public InstructorDetailsService getDetailsService() {
		return detailsService;
	}

	public void setDetailsService(InstructorDetailsService detailsService) {
		this.detailsService = detailsService;
	}
	

}
