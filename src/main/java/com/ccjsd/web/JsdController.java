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

import com.ccjsd.business.jsd.Jsd;
import com.ccjsd.business.jsd.JsdRepository;
import com.ccjsd.util.CCJSDMaintenanceReturn;

@CrossOrigin
@Controller 
@RequestMapping(path="/Jsds") 
public class JsdController extends BaseController {
	@Autowired 
	private JsdRepository jsdRepository;

	@GetMapping(path="/List") 
	public @ResponseBody Iterable<Jsd> getAllJsds() {
		return jsdRepository.findAll();
	}
	
	@GetMapping(path="/Get")
	public @ResponseBody List<Jsd> getUSer (@RequestParam int id) {
		
		Optional<Jsd> u =jsdRepository.findById(id);
		return getReturnArray(u.get());
	}

	
	@PostMapping(path="/Add") 
	public @ResponseBody CCJSDMaintenanceReturn addNewJsd (@RequestBody Jsd jsd) {
			try {
		jsdRepository.save(jsd);
		return CCJSDMaintenanceReturn.getMaintReturn(jsd);
	}
			catch (Exception e) {
		jsd = null;
	}
return CCJSDMaintenanceReturn.getMaintReturn(jsd);
}
	
	@GetMapping(path="/Remove") 
	public @ResponseBody CCJSDMaintenanceReturn deleteJsd (@RequestParam int id) {
		
	Optional <Jsd> jsd = jsdRepository.findById(id);
		try {
	jsdRepository.delete(jsd.get());
}
catch (Exception e) {
	jsd = null;
}
return CCJSDMaintenanceReturn.getMaintReturn(jsd);
}
	
	@PostMapping(path="/Change") 
	public @ResponseBody CCJSDMaintenanceReturn updateJsd (@RequestBody Jsd jsd) {
		try {
			jsdRepository.save(jsd);
		}
		catch (Exception e) {
			jsd = null;
		}
	return CCJSDMaintenanceReturn.getMaintReturn(jsd);
	}
}


	
	
	
	