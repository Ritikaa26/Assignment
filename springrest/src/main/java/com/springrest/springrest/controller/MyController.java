package com.springrest.springrest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.home;
import com.springrest.springrest.services.ServiceImpl;

import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
public class MyController {
   @Autowired 
private ServiceImpl homeservices;
    
	@PostMapping("/load")
	 public String addLoad(@RequestBody home load) {
		return this.homeservices.addLoad(load);
	   }
	 
	 @GetMapping("/load")
	 
	 public List<home> listgetbyId(@RequestParam String id) {
		 return this.homeservices.listgetbyId(id);
	 }
	 
	 @GetMapping("/load/{loadId}")
	 public home getbyId(@PathVariable int loadId) {
		 return this.homeservices.getbyId(loadId);
	 }
	 
	 @PutMapping("/load/{loadId}")
	 public String update(@RequestBody home load,@PathVariable int loadId) {
		 return this.homeservices.updatebyId(load,loadId);
	 }
	
	@DeleteMapping("/load/{loadId}")
    public String deleteload(@PathVariable int loadId){
        return  this.homeservices.deleteById(loadId);
    }

	 
}

    
