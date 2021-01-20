
package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.entity.PetCustomer;
import com.entity.PetDetail;
import com.service.PetshopService;

@Controller
public class PetShopController {

	@Autowired
	private PetshopService petshopService;

	@RequestMapping("/")
	public ModelAndView homePage(ModelAndView model, HttpServletRequest request) {
		List<PetCustomer> petCustomerDetails = petshopService.getPetCustomerDetails();
		model.addObject("customerList", petCustomerDetails);
		model.setViewName("homePage");
		return model;
	}

	@RequestMapping("/petHome")
	public ModelAndView petDetails(ModelAndView model, HttpServletRequest request) {
		List<PetDetail> petDetails = petshopService.getPetDetails();
		model.addObject("petList", petDetails);
		model.setViewName("petHome");
		return model;
	}

	@RequestMapping("/userRegistration")
	public String userRegistration() {
		return "userRegistration";
	}

	@RequestMapping("/petRegistration")
	public ModelAndView petRegistration(ModelAndView model) {
		model.addObject("petDetail", new PetDetail());
		model.setViewName("petRegistration");
		return model;
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "loginPage";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}

	@RequestMapping("/addPets")
	public ModelAndView addPets(ModelAndView model, @ModelAttribute("petDetail") PetDetail petDetail) {
		petshopService.savePetDetail(petDetail);
		List<PetDetail> petDetails = petshopService.getPetDetails();
		model.addObject("petList", petDetails);
		model.setViewName("petHome");
		model.addObject("flag", true);
		return model;

	}

	/*
	 * @RequestMapping("/customerRegistration") public ModelAndView
	 * customerRegistration(ModelAndView model,@ModelAttribute("petCustomer")
	 * PetCustomer petCustomer){ petshopService.savePetCustomer(petCustomer);
	 * List<PetDetail> petDetails=petshopService.getPetCustomer();
	 * model.addObject("customerList",petCustomer); model.setViewName("petHome");
	 * model.addObject("flag",true); return model; /*
	 * 
	 * @RequestMapping("/buyPets") public ModelAndView
	 * buyPets(@RequestParam("id")int id){ List<PetDetail>
	 * petDetails=petshopService.getPetDetails();
	 * 
	 * return "buyPet";
	 * 
	 * }
	 */
}


