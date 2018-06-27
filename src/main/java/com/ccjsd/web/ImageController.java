package com.ccjsd.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccjsd.util.CCJSDMaintenanceReturn;
import com.ccjsd.business.image.Image;
import com.ccjsd.business.image.ImageRepository;

@CrossOrigin
@Controller    
@RequestMapping(path="/Images") 
public class ImageController extends BaseController {
	@Autowired 
	private ImageRepository imageRepository;

	@GetMapping(path="/List") 
	public @ResponseBody Iterable<Image> getAllImages() {
		return imageRepository.findAll();
	}
	
	@GetMapping(path="/Get")
	public @ResponseBody List<Image> getImage (@RequestParam int id) {
		
		Optional<Image> i=imageRepository.findById(id);
		return getReturnArray(i.get());
	}
	
	@PostMapping(path="/Add") 
	public @ResponseBody CCJSDMaintenanceReturn addNewImage (@RequestBody Image image) {
			try {
		imageRepository.save(image);
		return CCJSDMaintenanceReturn.getMaintReturn(image);
	}
	catch (Exception e) {
		image = null;
	}
return CCJSDMaintenanceReturn.getMaintReturn(image);
}
	@GetMapping(path="/Remove") 
	public @ResponseBody CCJSDMaintenanceReturn deleteImage (@RequestParam int id) {
		Optional<Image> image = imageRepository.findById(id);
		try {
			Image i = image.get();
			imageRepository.delete(i);
			System.out.println("Image deleted:  "+i);
		}
		catch (Exception e) {
			image = null;
		}
		return CCJSDMaintenanceReturn.getMaintReturn(image);
	}
	
	@PostMapping(path="/Change") 
	public @ResponseBody CCJSDMaintenanceReturn updateImage (@RequestBody Image image) {
		try {
			imageRepository.save(image);
			System.out.println("Image updated:  "+image);
		}
		catch (Exception e) {
			image = null;
		}
		return CCJSDMaintenanceReturn.getMaintReturn(image);
	}
}