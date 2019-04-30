package com.niit.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.models.Supplier;
import com.niit.dao.SupplierDao;

@Repository("SupplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	SessionFactory sessionFactory; 
	
	public boolean addSupplier(Supplier supplier) 
	{
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}


	public boolean deleteSupplier(Supplier supplier ) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(supplier);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	
	public boolean updateSupplier(Supplier supplier) 
	{
		try
		{
		sessionFactory.getCurrentSession().update(supplier);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Supplier getSupplier(int supplierId) 
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
		session.close();
		return supplier;
	}

	public List<Supplier> listSupplier() 
	{
		Session session=sessionFactory.openSession();
	
		List<Supplier> listSuppliers=(List<Supplier>)session.createQuery("from Supplier").list();
		session.close();
		return listSuppliers;
	}


	@Override
	public List<Supplier> listSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}


	
}