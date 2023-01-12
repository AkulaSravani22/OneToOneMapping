package com.assignment.OneToOneMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.OneToOneMapping.Entity.Instructor;
import com.assignment.OneToOneMapping.repository.InstructorRepository;


@Service
public class InstructorService {
	@Autowired
	private InstructorRepository instructorRepository;
	
	public InstructorRepository getInstructorRepository() {
		return instructorRepository;
	}

	public void setInstructorRepository(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	public Instructor save(Instructor instructor)
	{
		return instructorRepository.save(instructor);
		
	}
	
	public Instructor getInstructor(Long id)
	{
		return instructorRepository.findById(id).get();
		
	}

	public Instructor update(Instructor instructor)
	
	{
		Instructor e =instructorRepository.findById(instructor.getId()).get();
		e.setFirst_name(instructor.getFirst_name());
		e.setLast_name(instructor.getLast_name());
		e.setEmail(instructor.getEmail());
		
		return instructorRepository.save(e);
		
	}
	public String delete(Long id) {
		instructorRepository.deleteById(id);
		
		return " Entity deleted"+id;
	}
}
