package com.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PetshopDao;
import com.entity.PetCustomer;
import com.entity.PetDetail;
import com.service.PetshopService;

@Service
@Transactional
public class PetshopServiceImpl implements PetshopService {

	@Autowired
	private PetshopDao petshopDao;

	@Transactional
	public List<PetCustomer> getPetCustomerDetails() {
		// TODO Auto-generated method stub
		return petshopDao.getPetCustomerDetails();
	}

	@Override
	public List<PetDetail> getPetDetails() {
		// TODO Auto-generated method stub
		return petshopDao.getPetDetails();
	}

	@Override
	public void savePetDetail(PetDetail petDetail) {
		// TODO Auto-generated method stub
		petshopDao.savePetDetail(petDetail);

	/*@Override
	public void savePetCustomer(PetCustomer petCustomer) {
		// TODO Auto-generated method stub
		petshopDao.savePetCustomer(petCustomer);

*/
	}

}
