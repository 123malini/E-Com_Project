package com.niit.ShopWatchBackEnd.dao;

import com.niit.ShopWatchBackEnd.model.Supplier;

public interface SupplierDao {
	boolean insertSupplier(Supplier supplier);
	Supplier getbyId(int id);
	boolean updateSupplier(Supplier supplier);
	boolean deleteSupplier(Supplier supplier);
}

