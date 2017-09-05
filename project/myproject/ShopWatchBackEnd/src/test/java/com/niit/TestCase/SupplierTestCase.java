package com.niit.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShopWatchBackEnd.dao.ProductDao;
import com.niit.ShopWatchBackEnd.dao.SupplierDao;
import com.niit.ShopWatchBackEnd.model.Product;
import com.niit.ShopWatchBackEnd.model.Supplier;

public class SupplierTestCase {
@Autowired
static AnnotationConfigApplicationContext context;
@Autowired
static SupplierDao supplierdao;
@BeforeClass
public static void init(){
	context = new AnnotationConfigApplicationContext();
	context.scan("com");
	context.refresh();
	supplierdao= (SupplierDao)context.getBean("supplierdao");
}

/*@Test
public void creatSupplier(){.
	Supplier supplier=new Supplier();
	supplier.setId(123456789);
	supplier.setName("sonata");
	supplier.setAdress("dumdum");
Assert.assertEquals(true, supplierdao.insertSupplier(supplier));
}*/
/*@Test
public void updateSupplier(){
Supplier supplier=supplierdao.getbyId(38);
supplier.setName("titan");
supplier.setAdress("delhi");
Assert.assertEquals(true, supplierdao.updateSupplier(supplier));
}*/
@Test
public void deleteSupplier(){
	Supplier supplier=supplierdao.getbyId(38);

	Assert.assertEquals(true,supplierdao.deleteSupplier(supplier));
}
}

