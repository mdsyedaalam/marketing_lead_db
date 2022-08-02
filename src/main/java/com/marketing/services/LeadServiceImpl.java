package com.marketing.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marketing.entities.Lead;
import com.marketing.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired //Dependency Injection
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead l) {
		leadRepo.save(l); //To save data in to the database
	}
	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll(); //To read data in the database
		return leads; 
	}
	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id); //To delete data from the database
	}
	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id); //To find the record by ID# in the database
		Lead lead = findById.get();
		return lead;
	}
}