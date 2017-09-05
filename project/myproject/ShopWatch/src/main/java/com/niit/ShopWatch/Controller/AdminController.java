package com.niit.ShopWatch.Controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShopWatchBackEnd.dao.ProductDao;
import com.niit.ShopWatchBackEnd.model.Product;


@Controller
public class AdminController {
	@Autowired
	HttpServletRequest request;
	@Autowired
	ProductDao p;
	@RequestMapping("/product")
	public ModelAndView product(){
	List<Product> list=p.getAll();
		ModelAndView mv= new ModelAndView("adminpro");
		 mv.addObject("product",new Product() );
		 mv.addObject("prdlist", list);
		 return mv;
		}
	
	@RequestMapping(value="/productsubmit" , method=RequestMethod.POST)
	public String ProductSubmit(@ModelAttribute("product") Product product,ModelMap model,@RequestParam("file") MultipartFile file){
		if (product.getProductId()==0 ){
			
			
			if (!file.isEmpty()) {
				try {
					

					// Creating the directory to store file
					String rootpath=request.getServletContext().getRealPath("/resource/images/product/");
					
					 
					File dir = new File(rootpath);
					if (!dir.exists())
						dir.mkdirs();
                  String upload=rootpath + file.getOriginalFilename();
                  System.out.println("Upload" +upload);
                  System.out.println("Upload" + rootpath);
                  File destination=new File(upload);
                
                 file.transferTo(destination);
                  
                  product.setProduct_image(file.getOriginalFilename());
                  p.insertProduct(product);
				}
				catch(Exception e){}
			}
			return "redirect:/";
		}
		else{
			p.updateProduct(product);
			System.out.println("uopload sucessfully");
			return "redirect:/admin/product";
		}
	}
					// Create the file on server
//					File serverFile = new File(dir.getAbsolutePath()
//							+ File.separator );
//					BufferedOutputStream stream = new BufferedOutputStream(
//							new FileOutputStream(serverFile));
//					stream.write(bytes);
//					stream.close();
//
//					logger.info("Server File Location="
//							+ serverFile.getAbsolutePath());
//					return "You successfully uploaded file=";
//				} catch (Exception e) {
//					return "You failed to upload " + " => " + e.getMessage();
//				}
//			} 
//			else {
//				return "You failed to upload " 
//						+ " because the file was empty.";
//			}
//			 
//		}
//		
//		
//
//
//		else {
//			p.updateProduct(product);
//			System.out.println("hello");
//			return "redirect:/product";
//			
//		}
//}
	
	@GetMapping("/product/edit/{id}")
	public ModelAndView update(@PathVariable("id") int id){
		Product pro=p.getbyId(id);
		List<Product> list=p.getAll();
		ModelAndView mv= new ModelAndView("adminpro");
		 mv.addObject("product",pro);
		 mv.addObject("prdlist", list);
		 return mv;
		
	}
	/*@RequestMapping(value="/updatesubmit" , method=RequestMethod.POST)
	public ModelAndView updatesubmit(@ModelAttribute("update1") Product product){
		
		p.updateProduct(product);
		ModelAndView mv= new ModelAndView("homepage");
		  
		 return mv;
		}*/
	
	
	@GetMapping("/product/delete/{id}")
	public String delete(@PathVariable("id")int id){
		Product pro=p.getbyId(id);
		p.deleteProduct(pro);
		return "redirect:/product";
//		List<Product> list=p.getAll();
//		ModelAndView mv=new ModelAndView("adminpro");
//		mv.addObject("prdlist", list);
//		return mv;
//	
	}
	
	
	
	
	
	
	
}
