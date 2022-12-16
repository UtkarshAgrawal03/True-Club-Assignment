package com.example.TrueClubAssingment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TrueClubAssingment.Entity.Assignment;
import com.example.TrueClubAssingment.Repo.AssignmentRepo;

@Service
public class AssignmentService {
	@Autowired
	AssignmentRepo ar;
	//Service to Save data
	public Assignment save(Assignment as) {
		return ar.save(as);
	}
	//Service to find data by id 
	public Assignment getById(int id) {
		return ar.findById(id);
	}
	//Service to Get All data
	public List<Assignment> getAll(){
		return ar.findAll();
	}
	//Service to Delete data
	public String deleteById(int id) {
		if(ar.findById(id)!=null) {
		ar.deleteById(id);
		return "Deleted Successfully";
		}
		return "No Data With the Id"+id;
	}
	//Service to Update data
	public Assignment updateRecord(Assignment as) {
		return ar.save(as);
	}

}
