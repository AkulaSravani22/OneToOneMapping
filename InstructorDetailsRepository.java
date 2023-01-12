package com.assignment.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.OneToOneMapping.Entity.InstructorDetails;
@Repository
public interface InstructorDetailsRepository extends JpaRepository<InstructorDetails, Long>{

}
