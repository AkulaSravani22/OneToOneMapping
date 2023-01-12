package com.assignment.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.OneToOneMapping.Entity.Instructor;
@Repository
public  interface  InstructorRepository  extends JpaRepository<Instructor, Long>
{
	
	
}
