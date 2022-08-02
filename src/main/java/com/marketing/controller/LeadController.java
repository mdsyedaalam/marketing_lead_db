package com.marketing.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired //Dependency Injection
	private LeadService leadService;
	
	//handler method, To navigate to “create_lead.jsp”, because only controller can access this
	@RequestMapping("/createLead") //acts like @WebServlet
	public String viewCreateLeadPage() {
		return "create_lead"; //acts like RequestDispatcher
		//path of this jsp file given in "application.properties"
	}
	
	//Method #1
	@RequestMapping("/saveLead") 
	public String saveOneLead(@ModelAttribute("lead") Lead l, ModelMap model) {
		//ModelAttribute("lead")-"lead" object stores the data & ref variable is "l"
		//"Lead" is a entity class and "l" is ref. variable
		// ModelMap is same as "Request.set & getAttribute" to put back message in View Layer
		leadService.saveLead(l);
		model.addAttribute("msg", "Lead Saved Successfully");
		return "create_lead";
	}
	
	//Method#2: it will make the method argument lengthy if working with huge no. of fields, Recommended for less no. of fields
//	@RequestMapping("/saveLead2") 
//	public String saveOneLead(@RequestParam("name") String fName, @RequestParam("LastName") String lName, @RequestParam("emailId") String mail,  @RequestParam("mobileNumber") long mobile) {
//		Lead l = new Lead(); //lead Object is needed to save data in DB
//		l.setFirstName(fName);
//		l.setLastName(lName);
//		l.setEmail(mail);
//		l.setMobile(mobile);
//		leadService.saveLead(l);
//		return "create_lead2";
//	}
	
	
	//Method#3: DTO- Data Transfer Object
//	@RequestMapping("/saveLead3") 
//	public String saveOneLead(LeadData data, ModelMap model) { //Press Ctr+1, Create "LeadData" class in dto package
//		Lead ld = new Lead(); //lead Object is needed to save data in DB
//		ld.setFirstName(data.getFirstName());
//		ld.setLastName(data.getLastName());
//		ld.setEmail(data.getEmail());
//		ld.setMobile(data.getMobile());
//		
//		leadService.saveLead(ld);
//		model.addAttribute("msg", "Lead Saved Successfully");
//		return "create_lead3";
//	}
	
	@RequestMapping("/listAll")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("lds", leads);
		return "leadSearchResult";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam ("id") long id, ModelMap model) {
		leadService.deleteLeadById(id);
		
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("lds", leads);
		return "leadSearchResult"; //After delete stay on the same page
	}
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam ("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("leadUpd", lead);
		return "updateLead";
	}
	
	@RequestMapping("/updateLead") //Using DTO Method to update Lead data as we don't have entity class here
	public String updateOneLeadData(LeadData data, ModelMap model) {
		Lead ld = new Lead();
		ld.setId(data.getId());
		ld.setFirstName(data.getFirstName());
		ld.setLastName(data.getLastName());
		ld.setEmail(data.getEmail());
		ld.setMobile(data.getMobile());
		leadService.saveLead(ld);
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("lds", leads);
		return "leadSearchResult";
	}
}
