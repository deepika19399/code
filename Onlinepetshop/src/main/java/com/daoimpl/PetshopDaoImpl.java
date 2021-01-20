package com.daoimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.PetshopDao;
import com.entity.PetCustomer;
import com.entity.PetDetail;

@Repository
public class PetshopDaoImpl implements PetshopDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<PetCustomer> getPetCustomerDetails() {
		
		return sessionFactory.getCurrentSession().createQuery("from PetCustomer")
                .list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<PetDetail> getPetDetails() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from PetDetail")
                .list();
	}

	@Override
	public void savePetDetail(PetDetail petDetail) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(petDetail);
	}

}

