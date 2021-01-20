package com.service;
import java.util.List;

import com.entity.PetCustomer;
import com.entity.PetDetail;

public interface PetshopService {
	List<PetCustomer> getPetCustomerDetails();
	List<PetDetail> getPetDetails();
	void savePetDetail(PetDetail petDetail);
	//void savepetCustomer(PetCustomer petCustomer);
}
