package com.uity;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uity.dao.LaptopsDAO;
import com.uity.model.Laptops;


@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);
	@Autowired(required=true)
	private LaptopsDAO laptopsDAO;	
	@Autowired(required=true)
	ServletContext servletContext;
	
	/*@RequestMapping(value="/home")
	public String home (@ModelAttribute("laptops") Laptops laptops,ModelMap model) throws IOException
	{
	List<Laptops> listLaptops = laptopsDAO.list();
	
	laptops.setLaptopsList(listLaptops);
	model.addAttribute("laptops", laptops);
	return "home";
    }*/
	
	
	
	/*
	@RequestMapping(value = "/newContact", method = RequestMethod.GET)
	public String newContact(@ModelAttribute("contact") Contact contact,ModelMap model) {
		Contact newContact = new Contact();
		contact.setContact(newContact);
		model.addAttribute("contact",contact);
		return "contact";
	}
*/
	
	/*@RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	public String saveContact(@ModelAttribute("contact") Contact contact) {
		 upload portion
		   InputStream inputStream = null;  
		  OutputStream outputStream = null;  
		  
		  MultipartFile file = contact.getFile();  
	
		  
		  String fileName = file.getOriginalFilename();  
		 
	 		 
		  try {  
		   inputStream = file.getInputStream();  
		   
		   String absolutePath = servletContext.getRealPath("/");
		   File dir = new File(absolutePath + File.separator + "uploadFile");

		
		   File newFile = new File(dir.getAbsolutePath() +File.separator + fileName);  
		   System.out.println("file" + newFile);
		   outputStream = new FileOutputStream(newFile);  
		   int read = 0;  
		   byte[] bytes = new byte[1024];  
		  
		   while ((read = inputStream.read(bytes)) != -1) {  
		    outputStream.write(bytes, 0, read);  
		   }  
		  } catch (IOException e) {  
		   // TODO Auto-generated catch block  
		   e.printStackTrace();  
		  }  
		  if (file.getSize()<1) {
			  contact.setFileName(contact.getFileName());
		  }
		  else 
			  {
			  String saveFile= "uploadFile" + "/" + fileName;
			  contact.setFileName(saveFile);
			  }
		 
		  
		contactDAO.saveOrUpdate(contact);		
		return "redirect:home.do";
	}*/
	
	/*@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public String deleteContact(@ModelAttribute("contact") Contact contact, @RequestParam("id") String id) {
		int contactId = Integer.parseInt(id);
		contactDAO.delete(contactId);
		
		return "redirect:home.do";
	}*/
	
	
	@RequestMapping(value="/home")
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView("home");
	return mav;
    }
	
	
	
	
	
	
	
	@RequestMapping(value="/list")
	public String listLaptops (@ModelAttribute("laptops") Laptops laptops,ModelMap model) throws IOException
	{
	List<Laptops> listLaptops = laptopsDAO.list();
	
	laptops.setLaptopsList(listLaptops);
	model.addAttribute("laptops", laptops);
	return "list";
    }
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String  search(@ModelAttribute("laptops") Laptops laptops, @RequestParam("brand") String brand, @RequestParam("ram") String ram, @RequestParam("hdd") String hdd, ModelMap model)
	{
		System.out.println("search");
		//int contactId = Integer.parseInt(id);
		List<Laptops> listLaptops = laptopsDAO.get(brand, ram, hdd);
	     laptops.setLaptopsList(listLaptops);
		
		
		model.addAttribute("laptops",laptops);
		
		return "search";
	}
}
