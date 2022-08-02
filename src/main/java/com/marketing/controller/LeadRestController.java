package com.marketing.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@RestController //Web Service Layer
@RequestMapping("/api/leads")
public class LeadRestController {
	
	@Autowired //to Interact with DB
	private LeadService leadService;
	
	@GetMapping
	public List <Lead> getAllleads() {
		List<Lead> leads = leadService.listLeads();
		return leads;
	}
}