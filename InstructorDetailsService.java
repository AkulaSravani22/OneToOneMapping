package com.assignment.OneToOneMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.OneToOneMapping.Entity.InstructorDetails;
import com.assignment.OneToOneMapping.repository.InstructorDetailsRepository;
@Service
public class InstructorDetailsService {
	
	@Autowired
	private InstructorDetailsRepository instructorDetailsRepository;
	
	
	public InstructorDetails save(InstructorDetails details)
	{
		return instructorDetailsRepository.save(details);
	}
	public InstructorDetails getInstructorDetails(Long id)
	{
		return instructorDetailsRepository.findById(id).get();
	}

	public InstructorDetailsRepository getInstructorDetailsRepository() {
		return instructorDetailsRepository;
	}

	public void setInstructorDetailsRepository(InstructorDetailsRepository instructorDetailsRepository) {
		this.instructorDetailsRepository = instructorDetailsRepository;
	}

}
