package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.model.MedicationPlan;
@RestController
public class MedicationPlanController {

	//	@RequestMapping("/user")
	//    public Principal user(Principal user) {
	//         return user;
	//    }
	//	
	//	@RequestMapping({"/uploadMedicationPlan"})
	//	public String uploadMedicationPlan(Principal principal) {
	//		return "Upload done";
	//	}
	//	
	//	@RequestMapping({"/downloadMedicationPlan"})
	//	public String downloadMedicationPlan(Principal principal) {
	//		return "Medplan as Json";
	//	}
	//@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(method = RequestMethod.GET, value = "/medicationPlan/{id}")
	@ResponseBody
	public MedicationPlan findById(@PathVariable long id) {
		return
				new MedicationPlan(11, "absdlabdsla");
	}


}
