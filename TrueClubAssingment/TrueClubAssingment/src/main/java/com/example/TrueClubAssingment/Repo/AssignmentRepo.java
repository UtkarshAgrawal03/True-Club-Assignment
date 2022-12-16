package com.example.TrueClubAssingment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TrueClubAssingment.Entity.Assignment;
@Repository
public interface AssignmentRepo extends JpaRepository<Assignment, Integer>{
	public Assignment findById(int id);

}
