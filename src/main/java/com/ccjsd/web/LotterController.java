package com.ccjsd.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccjsd.business.lotter.Lotter;
import com.ccjsd.business.lotter.LotterRepository;
import com.ccjsd.util.CCJSDMaintenanceReturn;

@CrossOrigin
@Controller    
@RequestMapping(path="/Lotters") 
public class LotterController extends BaseController {
	@Autowired 
	private LotterRepository lotterRepository;

	@GetMapping(path="/List") 
	public @ResponseBody Iterable<Lotter> getAllLotters() {
		return lotterRepository.findAll();
	}
	
	@GetMapping(path="/Get")
	public @ResponseBody List<Lotter> getLotter (@RequestParam int id) {
		
		Optional<Lotter> l =lotterRepository.findById(id);
		return getReturnArray(l.get());

	}
	
	@PostMapping(path="/Add") 
	public @ResponseBody CCJSDMaintenanceReturn addNewLotter (@RequestBody Lotter lotter) {
			try {
		lotterRepository.save(lotter);
		return CCJSDMaintenanceReturn.getMaintReturn(lotter);
	}
			catch (Exception e) {
		lotter = null;
	}
return CCJSDMaintenanceReturn.getMaintReturn(lotter);
}
	
	@GetMapping(path="/Remove") 
	public @ResponseBody CCJSDMaintenanceReturn deleteLotter (@RequestParam int id) {
	
	Optional <Lotter> lotter = lotterRepository.findById(id);
		try {
	lotterRepository.delete(lotter.get());

}
catch (Exception e) {
	lotter = null;
}
return CCJSDMaintenanceReturn.getMaintReturn(lotter);
}
	
	@PostMapping(path="/Change") 
	public @ResponseBody CCJSDMaintenanceReturn updateLotter (@RequestBody Lotter lotter) {
		try {
			lotterRepository.save(lotter);
			System.out.println("Lotter updated:  "+lotter);
		}
		catch (Exception e) {
			lotter = null;
		}
	return CCJSDMaintenanceReturn.getMaintReturn(lotter);
	}
}


	
	
	
	