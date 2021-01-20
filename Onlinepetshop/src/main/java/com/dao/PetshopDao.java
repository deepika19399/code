package com.dao;
import java.util.List;

import com.entity.PetCustomer;
import com.entity.PetDetail;

public interface PetshopDao {
	List<PetCustomer> getPetCustomerDetails();
	List<PetDetail> getPetDetails();
	void savePetDetail(PetDetail petDetail);
	//void savePetCustomer(PetCustomer petCustomer);
}

