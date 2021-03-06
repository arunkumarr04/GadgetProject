package com.niit.dao;


	import java.util.List;

	import com.niit.models.Supplier;

		
	public interface SupplierDao 
	{
		
			public abstract  boolean addSupplier(Supplier supplier);
			public abstract  boolean deleteSupplier(Supplier supplier);
			public  boolean updateSupplier(Supplier supplier);
			public Supplier getSupplier(int supplierId);
			public List<Supplier> listSuppliers();
}
