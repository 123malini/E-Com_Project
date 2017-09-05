package com.niit.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShopWatchBackEnd.dao.ProductDao;
import com.niit.ShopWatchBackEnd.model.Product;

public class ProductTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static ProductDao product1;
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		product1= (ProductDao)context.getBean("product1");
	}

	/*@Test
	public void creatProduct(){
		Product product = new Product();
		product.setCompany_name("titan");
		product.setProduct_description("good");
		product.setProduct_price(1233);
		product.setProduct_image("nice");
		Assert.assertEquals(true, product1.insertProduct(product));
	}*/
	/*@Test
	public void updateProduct(){
		
		Product p=product1.getbyId(3);
		p.setCompanyName("skjdvn");
		p.setProductDescription("slkdnfj");
		p.setProductImage("sldkncv");
		p.setPrice(588);
		p.setProductName("lksdnfc");
		Assert.assertEquals(true, product1.updateProduct(p));
	}*/
	
	/*@Test
	public void deleteProduct(){
		Product productdelete = product1.getbyId(5);
		Assert.assertEquals(true, product1.deleteProduct(productdelete));
	}*/
	
	
	@Test
	public void listProduct(){
		Assert.assertEquals(2, product1.getAll().size());
	}
}


